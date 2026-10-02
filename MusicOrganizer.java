import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
    
    /**
     * Solution to Question 1
     * Doesn't work as expected if the collection is empty.
     */
    public void checkIndex(int index) { 
        if (!(index >= 0 && index <= files.size()-1)) {
            System.out.println("Invalid index! Valid indexes are: 0-" + (files.size()-1));
        }
    }
    
    /**
     * Solution to Question 2
     * Works as expected if the collection is empty.
     */
    public boolean validIndex(int index) {
        return (index >= 0 && index < files.size());
    }
    
    /*
     * Question 4: 
     * public void listAllFiles() {}
     * Return type: void
     * No parameters.
     */
    
    /*
     * Question 5:
     * To complete the method, it's better if we use a for each loop, since it depends on the size of the collection.
     */
    
    /**
     * Solution to Question 6
     */
    public void listAllFiles() {
        for (String filename : files) {
            System.out.println(filename);
        }
    }
    
    /**
     * Solution to question 7 
     */
    public void listWithIndex() {
        int position = 0;
        for (String filename : files) {
            System.out.println(position + ": " + filename);
            position++;
        }
    }
    
    /**
     * Solution to question 8
     */
    public void listMatching(String searchString) {
        boolean match = false;
        for (String filename : files) {
            if (filename.contains(searchString)) {
                // A match
                System.out.println(filename);
                match = true;
            }
        }
        if (!match) {
            System.out.println("No match has been found!");
        }
    }
}
