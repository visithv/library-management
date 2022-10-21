/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libraryman.libmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Database 
{
    public static Connection con = null;
    public static PreparedStatement ps = null;
    public static ResultSet rs = null;

    public static void connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","abcd1234"); 
        }
        catch(Exception e)
        {
            System.out.println("Error in connection"+e);
        }
    }
    
    public static void deleteBook(int bookId)
    {
        try 
        {
            ps = con.prepareStatement("DELETE FROM `books` WHERE bookid=" + String.valueOf(bookId));
            
            ps.execute();
            
        }catch (Exception ex) { }
    }
    
    public static void addLog(int bookId, String name)
    {
        try 
        {
            Calendar c= Calendar.getInstance();
            c.add(Calendar.DATE, 30);
            Date dateAfter = c.getTime();
            
            ps = con.prepareStatement("INSERT INTO `logs` (bookid,name,datetaken,returndate) VALUES (?, ?, ?, ?)");
            
            ps.setInt(1, bookId);
            ps.setString(2, name);
            ps.setDate(4, new java.sql.Date(dateAfter.getTime()));
            ps.setDate(3, java.sql.Date.valueOf(java.time.LocalDate.now()));
            
            ps.execute();
            
        }catch (Exception ex) { System.out.println(ex.getMessage()); }
    }
    
    public static List<Log> getLogs()
    {
        List<Log> logs = new ArrayList<>();
        
        try 
        {
            ps = con.prepareStatement("SELECT * FROM `logs` ORDER BY `bookid` ASC");
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                Log log = new Log();
                
                log.bookid = rs.getInt("bookid");
                log.name = rs.getString("name");
                log.datetaken = rs.getDate("datetaken");
                log.returndate = rs.getDate("returndate");
                log.id = rs.getInt("id");
                
                logs.add(log);
            }
            
        } catch (Exception ex) { }
        
        return logs;
    }
    
    public static List<Log> getLogs(int bookid)
    {
        List<Log> logs = new ArrayList<>();
        
        try 
        {
            ps = con.prepareStatement("SELECT * FROM `logs` WHERE bookid=" + String.valueOf(bookid));
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                Log log = new Log();
                
                log.bookid = rs.getInt("bookid");
                log.name = rs.getString("name");
                log.datetaken = rs.getDate("datetaken");
                log.returndate = rs.getDate("returndate");
                log.id = rs.getInt("id");
                
                logs.add(log);
            }
            
        } catch (Exception ex) { }
        
        return logs;
    }
    
    public static void updateBook(Book book)
    {
        try 
        {
            System.out.println("Updating book " + book.title);
            PreparedStatement ps = con.prepareStatement("UPDATE `books` SET title='" + book.title
                    + "', description='" + book.description 
                    + "', author='" + book.author 
                    + "', published=" + book.published 
                    + ", availability=" + ((book.availability) ? "true" : "false")
                    + " WHERE bookid=" + book.bookId);
            
            ps.executeUpdate();
            
            System.out.println("Successfully updated book " + book.title);
            
        } catch (Exception ex) { System.out.println(ex.getMessage()); }
    }
    
    public static void addBook(Book book)
    {
        try 
        {
            ps = con.prepareStatement("INSERT INTO `books` (bookid, title, description, author, published, availability) VALUES (?, ?, ?, ?, ?, ?)");
            
            ps.setInt(1, book.bookId);
            ps.setString(2, book.title);
            ps.setString(3, book.description);
            ps.setString(4, book.author);
            ps.setInt(5, book.published);
            ps.setBoolean(6, true);
            
            ps.execute();
            
        } catch (Exception ex) { System.out.println(ex.getMessage()); }
    }
    
    public static Book getBook(String bookId)
    {
        Book b = new Book();
        
        try 
        {
            ps = con.prepareStatement("SELECT * FROM `books` WHERE bookid=" + bookId);
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                b.bookId = rs.getInt("bookid");
                b.title = rs.getString("title");
                b.description = rs.getString("description");
                b.author = rs.getString("author");
                b.published = rs.getInt("published");
                b.availability = rs.getBoolean("availability");
            }
            
        } catch (Exception ex) { }
        
        return b;
    }
    
    public static List<Book> getBooks(String bookId, String title, String author, Object before, Object after)
    {
        List<Book> list = new ArrayList<>();
        
        try
        {
            ps = con.prepareStatement("SELECT * FROM `books` ORDER BY `bookid` ASC");
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                Book b = new Book();
                
                b.bookId = rs.getInt("bookid");
                b.title = rs.getString("title");
                b.description = rs.getString("description");
                b.author = rs.getString("author");
                b.published = rs.getInt("published");
                b.availability = rs.getBoolean("availability");
                
                Boolean valid = true;
                
                // definite selection
                if (!bookId.equals(""))
                {
                    if (b.bookId.toString().equals(bookId))
                        valid = true;
                    else 
                        valid = false;
                }
                
                //checks
                if (!title.equals(""))
                {
                    if (!b.title.toLowerCase().contains(title.toLowerCase()))
                        valid = false;
                }
                
                if (!author.equals(""))
                {
                    if (!b.author.toLowerCase().contains(author.toLowerCase()))
                        valid = false;
                }
                
                try
                {
                    int before_i = (int) before;
                    int after_i = (int) after;
                    
                    if (b.published < after_i || b.published > before_i)
                    {
                        valid = false;
                    }
                }
                catch (Exception ex) {} 
                
                if (valid)
                    list.add(b);
            }

        }
        catch(Exception e)
        {
          System.out.println("Error in getData"+e);
        }
        
        return list;
    }
}
