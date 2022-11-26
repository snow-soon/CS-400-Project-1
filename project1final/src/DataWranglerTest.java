// --== CS400 Project One File Header ==--
// Name: <Soonho Chung>
// CSL Username: <soonho>
// Email: <schung75@wisc.edu>
// Lecture #: <002 @02:30pm>
// Notes to Grader: <>


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class DataWranglerTest {
        public static void main (String[] args){
        	String x;
        	if (test1()) x="passed";
        	else x="failed";
        	System.out.println("DW Individual Test 1: " + x);
        	
        	if (test2()) x="passed";
        	else x="failed";
        	System.out.println("DW Individual Test 2: " + x);
        	
        	if (test3()) x="passed";
        	else x="failed";
        	System.out.println("DW Individual Test 3: " + x);
        	
        	if (test4()) x="passed";
        	else x="failed";
        	System.out.println("DW Individual Test 4: " + x);
        	
        	if (test5()) x="passed";
        	else x="failed";
        	System.out.println("DW Individual Test 5: " + x);
        	
        	if (test6()) x="passed";
        	else x="failed";
        	System.out.println("DW Integration Test 1: " + x);
        	
        	if (test7()) x="passed";
        	else x="failed";
        	System.out.println("DW Integration Test 2: " + x);
        	
        	if (test8()) x="passed";
        	else x="failed";
        	System.out.println("DW Partner (AE) Test 1: " + x);
        	
        	if (test9()) x="passed";
        	else x="failed";
        	System.out.println("DW Partner (AE) Test 2: " + x);
        	
        }

        /**
        * This method tests whether the list loads the correct ISBN13 of the book 
        * @return true if it matches with the correct value
        */
        public static boolean test1() {
                String x = null;
                try {
                        BookLoader bookLoader = new BookLoader();
                        List<IBook> l = new ArrayList();
                        l = bookLoader.loadBooks("books.csv");
                        Book b = (Book) l.get(9);
                        x = (b.getISBN13());
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                }
                return x.equals("9.7814E+12");
        }

        /**
        * This method tests whether the list loads the correct authors of the book
        * @return true if it matches with the correct value
        */
        public static boolean test2() {
                String x = null;
                try {
                        BookLoader bookLoader = new BookLoader();
                        List<IBook> l = new ArrayList();
                        l = bookLoader.loadBooks("books.csv");
                        Book b = (Book) l.get(5);
                        x = (b.getAuthors());
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                }
                return x.equals("W. Frederick Zimmerman");
        }
        
        /**
         * This method tests whether the list loads the correct title of the book
         * @return true if it matches with the correct value
         */
         public static boolean test3() {
                 String x = null;
                 try {
                         BookLoader bookLoader = new BookLoader();
                         List<IBook> l = new ArrayList();
                         l = bookLoader.loadBooks("books.csv");
                         Book b = (Book) l.get(16);
                         x = (b.getTitle());
                 } catch (FileNotFoundException e) {
                         e.printStackTrace();
                 }
                 return x.equals("I'm a Stranger Here Myself: Notes on Returning to America After Twenty Years Away");
         }

         /**
         * This method tests whether the list loads the correct authors of the book
         * @return true if it matches with the correct value
         */
         public static boolean test4() {
                 String x = null;
                 try {
                         BookLoader bookLoader = new BookLoader();
                         List<IBook> l = new ArrayList();
                         l = bookLoader.loadBooks("books.csv");
                         Book b = (Book) l.get(542);
                         x = (b.getAuthors());
                 } catch (FileNotFoundException e) {
                         e.printStackTrace();
                 }
                 return x.equals("Ovid/William Scovil Anderson");
         }

         /**
         * This method tests whether the list loads the correct title of the book
         * @return true if it matches with the correct value
         */
         public static boolean test5() {
                 String x = null;
                 try {
                         BookLoader bookLoader = new BookLoader();
                         List<IBook> l = new ArrayList();
                         l = bookLoader.loadBooks("books.csv");
                         Book b = (Book) l.get(1000);
                         x = (b.getTitle());
                 } catch (FileNotFoundException e) {
                         e.printStackTrace();
                 }
                 return x.equals("Three Complete Novels: Tim/An Indecent Obsession/The Ladies of Missalonghi");
         }
         
         /**
     	 * This method verifies that the constructors and get/setAuthorFilter method
     	 * works properly and any relevant exceptions are thrown. This test is for
     	 * placeholder.
     	 * 
     	 * @return true if the test pass, or return false otherwise
     	 */
     	public static boolean test6() {
     		try {

    			BookMapperBackend map = new BookMapperBackend(true);

    			map.setAuthorFilter("Soonho");
    			if (!map.getAuthorFilter().equals("Soonho")) {
    				return false; // the author filter should be Soonho.
    			}
    		} catch (Exception e) {
    			return false;
    		}

    		return true; // test passed
     	}
     	
     	/**
    	 * This method verifies that the constructors and resetAuthorFilter method works
    	 * properly and any relevant exceptions are thrown. This test is for
    	 * placeholder.
    	 * 
    	 * @return true if the test pass, or return false otherwise
    	 */
     	public static boolean test7() {
     		try {

    			BookMapperBackend map = new BookMapperBackend(true);

    			map.setAuthorFilter("Soonho");
    			map.resetAuthorFilter();

    			// now the author filter is reset and null
    			if (map.getAuthorFilter() != null) {
    				return false;
    			}

    		} catch (Exception e) {

    			// unexpected error
    			return false;
    		}

    		return true; // test passed
     	}
     	
     	public static boolean test8() {
     	    // ROLE Partner (ROLE2) Test 1
     	    // tests a non valid ISBN number
     	    ISBNValidator newValidator = new ISBNValidator();
     	    String ISBN = "1234567890123";
     	    boolean b = newValidator.validate(ISBN); // should be false
     	    return !b;
     	}
     	
     	public static boolean test9() {
     	    // ROLE Partner (ROLE2) Test 2
     	    // tests many index locations that have multiple linked nodes
     	    IterableHashtableMap<Integer, Integer> newHashtable = new IterableHashtableMap<Integer,
     	            Integer>(10);

     	    // inserting values into the table
     	    newHashtable.put(17, 17);
     	    newHashtable.put(27, 27);
     	    newHashtable.put(8, 8);
     	    newHashtable.put(18, 18);
     	    newHashtable.put(9, 9);
     	    newHashtable.put(19,19);

     	    //System.out.println(newHashtable.toString());
     	    Iterator<Integer> i = newHashtable.iterator();
     	    //while (i.hasNext()) {
     	    //    System.out.println(i.next());
     	    //}
     	    String result = "";
     	    while (i.hasNext()) {
     	        result += i.next() + "\n";
     	    }

     	    String expected = "17\n" + "27\n" + "8\n" + "18\n" + "9\n" + "19\n";
     	    //System.out.println(result);
     	    return expected.equals(result);
     	}

 }

