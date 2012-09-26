package com.fuckingwin.shutupdb;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * The best ever database!
 * It will solve all of your need. Features include:
 * - Persistent persistence!
 * - Store anything (as long as it's a string)!
 * - Human coherent files!
 * - Garrulous verbosity!
 * - Can make you tea!
 * - Highly documented!
 * - Superfluous exclamation marks!!!
 * @author Sean
 */
public class StupendousHypersonicUnparalleledTerrificUtterlyPremiumDB {
	
	//Create a reference for our store!
	private final File store;
	//Create a reference for our log output!
	private final PrintStream logOutput;

	/**
	 * Create a new database object!
	 * @param store The database store directory!
	 * @throws IOException Thrown when the user fails!
	 */
	public StupendousHypersonicUnparalleledTerrificUtterlyPremiumDB(File store) throws IOException {
		//Set the output for our logging!
		logOutput = System.out;
		//Log what we're doing!
		log("Creating new database...");
		//Set our store!
		this.store = store;
		//Check if the database, or an imposter, already exists!
		if (store.exists()) {
			//Check if it's an imposter!
			if (!store.isDirectory()) {
				//Log the error!
				log("Given store is an existing file - must be a directory or non-existent.");
				//Throw an exception so the calling code knows!
				throw new IOException("Given store is an existing file - must be a directory or non-existent.");
			}
		} else {
			//Make the required directories!
			store.mkdirs();
		}
		//Log out success!
		log("New database created!");
	}
	
	/**
	 * Create a new database object!
	 * @param store The database store directory!
	 * @throws IOException Thrown when the user fails!
	 */
	public StupendousHypersonicUnparalleledTerrificUtterlyPremiumDB(String store) throws IOException {
		//Convenience for the user!
		this(new File(store));
	}
	
	/**
	 * Stores a value under a key!
	 * @param key The key to store the value under!
	 * @param value The value to store under the key!
	 * @return Whether we succeeded or the user failed!
	 */
	public boolean putValueIntoThisAwesomeDatabase(String key, String value) {
		//Sanitise the key!
		key = sanitiseKeyForThisAwesomeDatabaseBecauseYourOperatingSystemIsRubbish(key);
		//Log what we're doing!
		log("Storing value \"" + value + "\" under key \"" + key + "\".");
		//Create a new file reference for the entry!
		File entry = new File(store, key);
		//Check if there's already an entry, or an imposter, there!
		if (!entry.exists()) {
			//Log what we're doing!
			log("Creating entry...");
			try {
				//Create a file for our entry!
				entry.createNewFile();
			} catch (IOException ex) {
				//Log the error!
				log("Could not create entry for some reason. Here's a stack trace to show where you went wrong:");
				//Log the exception too!
				log(ex);
			}
		//Check if it's an imposter!
		} else if (!entry.isFile()) {
			//Log the error!
			log ("Could not store value because there is a directory in my way. :(");
			//Tell the calling code that the user failed at harnessing our awesomness!
			return false;
		}
		//Create a new reference for our entry writer!
		FileWriter writer = null;
		try {
			//Actually create the writer!
			writer = new FileWriter(entry);
			//Write our entry data!
			writer.write(value);
			//Actually write the data to the store!
			writer.flush();
		} catch (IOException ex) {
			//Log the error!
			log("Could not write entry for some reason. Here's a stack trace to show where you went wrong:");
			//Log the exception too!
			log(ex);
		} finally {
			try {
				//Close our entry writer!
				writer.close();
			} catch (IOException ex) {
				//Log the error!
				log("Could not close entry for some reason. Here's a stack trace to show where you went wrong:");
				//Log the exception too!
				log(ex);
			}
		}
		//Tell the calling code that our awesomness succeeded, as always!
		return true;
	}

	/**
	 * Stores a value under a key!
	 * @param key The key to store the value under!
	 * @param value The value to store under the key!
	 * @return Whether we succeeded or the user failed!
	 */
	public boolean putValueIntoThisAwesomeDatabase(String key, Object value) {
		//Check that the user isn't being stupid!
		if (value == null) {
			//Fix the stupidity!
			value = "";
			//Log what we're doing!
			log("Storing null as zero-length String, because why should you have to worry your pretty little head about types and stuff while using an OO language - that's crazy!");
		} else {
			//Log what we're doing!
			log("Converting value of type " + value.getClass() + " to String, because " + getReasonForAwesomeness());
		}
		//Get that other method to do the work!
		return putValueIntoThisAwesomeDatabase(key, String.valueOf(value));
	}

	/**
	 * Stores a value under a key!
	 * @param key The key to store the value under!
	 * @param value The value to store under the key!
	 * @return Whether we succeeded or the user failed!
	 */
	public boolean putValueIntoThisAwesomeDatabase(String derp, byte value) {
		//Log what we're doing!
		log("Converting value of type byte to String, because " + getReasonForAwesomeness());
		//Get that other method to do the work!
		return putValueIntoThisAwesomeDatabase(derp, String.valueOf(value));
	}

	/**
	 * Stores a value under a key!
	 * @param key The key to store the value under!
	 * @param value The value to store under the key!
	 * @return Whether we succeeded or the user failed!
	 */
	public boolean putValueIntoThisAwesomeDatabase(String derp, short value) {
		//Log what we're doing!
		log("Converting value of type short to String, because " + getReasonForAwesomeness());
		//Get that other method to do the work!
		return putValueIntoThisAwesomeDatabase(derp, String.valueOf(value));
	}

	/**
	 * Stores a value under a key!
	 * @param key The key to store the value under!
	 * @param value The value to store under the key!
	 * @return Whether we succeeded or the user failed!
	 */
	public boolean putValueIntoThisAwesomeDatabase(String derp, int value) {
		//Log what we're doing!
		log("Converting value of type int to String, because " + getReasonForAwesomeness());
		//Get that other method to do the work!
		return putValueIntoThisAwesomeDatabase(derp, String.valueOf(value));
	}

	/**
	 * Stores a value under a key!
	 * @param key The key to store the value under!
	 * @param value The value to store under the key!
	 * @return Whether we succeeded or the user failed!
	 */
	public boolean putValueIntoThisAwesomeDatabase(String derp, long value) {
		//Log what we're doing!
		log("Converting value of type long to String, because " + getReasonForAwesomeness());
		//Get that other method to do the work!
		return putValueIntoThisAwesomeDatabase(derp, String.valueOf(value));
	}

	/**
	 * Stores a value under a key!
	 * @param key The key to store the value under!
	 * @param value The value to store under the key!
	 * @return Whether we succeeded or the user failed!
	 */
	public boolean putValueIntoThisAwesomeDatabase(String derp, float value) {
		//Log what we're doing!
		log("Converting value of type float to String, because " + getReasonForAwesomeness());
		//Get that other method to do the work!
		return putValueIntoThisAwesomeDatabase(derp, String.valueOf(value));
	}

	/**
	 * Stores a value under a key!
	 * @param key The key to store the value under!
	 * @param value The value to store under the key!
	 * @return Whether we succeeded or the user failed!
	 */
	public boolean putValueIntoThisAwesomeDatabase(String derp, double value) {
		//Log what we're doing!
		log("Converting value of type double to String, because " + getReasonForAwesomeness());
		//Get that other method to do the work!
		return putValueIntoThisAwesomeDatabase(derp, String.valueOf(value));
	}
	
	/**
	 * Retrieve a value from under a key!
	 * @param key The key the value is stored under!
	 * @return The value stored under the key, or null if the user fails!
	 */
	public String getValueFromThisAwesomeDatabase(String key) {
		//Log what we're doing!
		log("Retrieving value under key \"" + key + "\".");
		//Sanitise the key!
		key = sanitiseKeyForThisAwesomeDatabaseBecauseYourOperatingSystemIsRubbish(key);
		//Create a new file reference for the entry!
		File file = new File(store, key);
		//Check if there's already an entry, or an imposter, there!
		if (!file.exists()) {
			//Log the error!
			log("Given key does not exist.");
			//Tell the calling code that the suer failed!
			return null;
		//Check if it's an imposter!
		} else if (!file.isFile()) {
			//Log the error!
			log("Given key points to directory - possible attempt at sabotage of awesomeness!");
			//Tell the calling code that the suer failed!
			return null;
		}
		//Create a new reference for our entry input!
		DataInputStream input = null;
		try {
			//Actually create our entry input!
			input = new DataInputStream(new FileInputStream(file));
			//Create a buffer for our entry!
			byte[] buffer = new byte[(int)file.length()];
			//Read our entry into our buffer!
			input.readFully(buffer);
			//Return the data!
			return new String(buffer);
		} catch (IOException ex) {
			//Log the error!
			log("Could not read entry for some reason. Here's a stack trace to show where you went wrong:");
			//Log the exception too!
			log(ex);
		} finally {
			try {
				//Close our input!
				input.close();
			} catch (IOException ex) {
				//Log the error
				log("Could not close entry for some reason. Here's a stack trace to show where you went wrong:");
				//Log the exception too!
				log(ex);
			}
		}
		//Tell the calling code that the user failed!
		return null;
	}
	
	/**
	 * Check if the key is already in the database!
	 * @param key The key to check the existence of!
	 * @return Whether or not the key exists!
	 */
	public boolean keyExistsInThisAwesomeDatabase(String key) {
		//Sanitise the key!
		key = sanitiseKeyForThisAwesomeDatabaseBecauseYourOperatingSystemIsRubbish(key);
		//Create a new entry file reference!
		File file = new File(store, key);
		//Tell the calling code if the entry exists!
		return file.exists() && file.isFile();
	}
	
	/**
	 * Retrieve all entries in the database!
	 * @return All entries in the database!
	 */
	public Map<String, String> getAllEntriesFromThisAwesomeDatabase() {
		//Get a list of all the entry files, and any imposters!
		File[] entries = store.listFiles();
		//Create our return data container!
		Map<String, String> data = new HashMap<String, String>(entries.length);
		//Loop through each entry file, including imposters!
		for (File entry : entries) {
			//Check for imposters!
			if (!entry.isFile() || !entry.getName().equals(sanitiseKeyForThisAwesomeDatabaseBecauseYourOperatingSystemIsRubbish(entry.getName()))) {
				//Log what we're doing!
				log("Invalid entry in database - ignoring the bad data (and possible attempt at sabotage of awesomeness), because " + getReasonForAwesomeness());
			} else {
				//Log what we're doing!
				log("Inserting data for key \"" + entry.getName() + "\" into return map.");
				//Add the entry to our return data!
				data.put(entry.getName(), getValueFromThisAwesomeDatabase(entry.getName()));
			}
		}
		//Return all the entries!
		return data;
	}
	
	/**
	 * Sanitise the key!
	 * @param key The key to sanitise!
	 * @return The sanitised key!
	 */
	public String sanitiseKeyForThisAwesomeDatabaseBecauseYourOperatingSystemIsRubbish(String key) {
		//Log what we're doing!
		log("Sanitising key, because " + getReasonForAwesomeness());
		//Check if the key is blank!
		if (key == null || key.equals("")) {
			//Set the key to a real key name!
			key = "_";
		}
		//Return the sanitised key!
		return key.replace(' ', '_').replaceAll("\\W", "~").substring(0, (key.length() > 255 ? 255 : key.length()));
	}

	/**
	 * Log a message!
	 * @param message The message to log!
	 */
	private void log(String message) {
		//Logging a message!
		logOutput.println(message);
	}

	/**
	 * Log a Throwable, such as exception!
	 * @param throwable The Throwable, such as exception, to log!
	 */
	private void log(Throwable throwable) {
		//Logging an exception!
		throwable.printStackTrace(logOutput);
	}

	/**
	 * Get the reason for a particular act of awesomeness!
	 * @return The reason for this act of awesomeness!
	 */
	private String getReasonForAwesomeness() {
		//We're awesome, and some part of us wants to know why!
		switch (new Random().nextInt(9)) {
			case 0:
				//A possible reason!
				return "I'm nice like that";
			case 1:
				//Another possible reason!
				return "I'm just that awesome";
			case 2:
				//Another possible reason!
				return "why not";
			case 3:
				//Another possible reason!
				return "applebananagrapefruit";
			case 4:
				//Another possible reason!
				return "you're obviously not too bright";
			case 5:
				//Another possible reason!
				return "I'm bored";
			case 6:
				//Another possible reason!
				return "you're better safe than sorry";
			case 7:
				//Another possible reason!
				return "!!!!!!";
			case 8:
				//Another possible reason!
				return "I'm the best database system";
			default:
				//The above case could be changed to the default case, but screw that!
				return "this is never gonna happen";
		}
	}
}
