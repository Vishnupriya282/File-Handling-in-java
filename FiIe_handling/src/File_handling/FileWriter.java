package File_handling;
import java.io.*;
import java.util.Scanner;

public class FileWriter {
	
       public static void main(String[] argw)
       {
    	   Scanner sc=new Scanner(System.in);
    	   String str=sc.next();
    	   StringBuffer str1=new StringBuffer("");
    	   int n=0;
    	   
    	   System.out.println("Enter 1 for writing caps into file \n Enter 2 for writing small into file \nEnter 3 for writing number into file\nEnter 4 for writing spl into file  \n");
    	   int choice=sc.nextInt();
    	   switch(choice)
    	   {
    		   case 1:
    			   for(int i=0;i<str.length();i++)
    			   {
    			   if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
    			   {
    				   str1.append(str.charAt(i));
    			   }
    			   }
    			   break;
    		   case 2:
    			   for(int i=0;i<str.length();i++)
    			   {
    			   if(str.charAt(i)>='a'&&str.charAt(i)<='z')
    			   {
    				   str1.append(str.charAt(i));
    			   }
    			   }
    			   break;
    		   case 3:
    			   for(int i=0;i<str.length();i++)
    			   {
    			   if(str.charAt(i)>=0&&str.charAt(i)<=9)
    			   {
    				   str1.append(str.charAt(i));
    			   }
    			   }
    			   break;
    		   case 4:
    			   for(int i=0;i<str.length();i++)
    			   {
    			   if(!(str.charAt(i)>='A'&&str.charAt(i)<='Z')&&(str.charAt(i)>='a'&&str.charAt(i)<='z')&&(str.charAt(i)>=0&&str.charAt(i)<=9))
    			   {
    				   str1.append(str.charAt(i));
    			   }
    			   }
    			   break;
    			   
    	   }
    	   String str2=str1.toString();
    	   writef(str2);
       }
    	   public static void writef(String str1)
    		{
    			try {
    				File f=new File("D:\\Project Backups\\write1.txt");
    				FileOutputStream fout=new FileOutputStream(f);
    				BufferedOutputStream bout=new BufferedOutputStream(fout);
    				byte[] by=str1.getBytes();
    				bout.write(by);
    				bout.close();
    				fout.close();
    				System.out.println("Success");
    				
    			}
    			catch(Exception e)
    			{
    				e.printStackTrace();
    			}
    		}	   
    			   
       }
