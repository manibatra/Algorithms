package hashing;

public class OpenAddressingHash {


	private final static int TABLE_SIZE=128;

	HashEntry[] table;

	public OpenAddressingHash() {

		table=new HashEntry[TABLE_SIZE];
		for(int i=0; i<TABLE_SIZE; i++){

			table[i]=null;

		}

	}


	public int get(int key){

		int hash=(key%TABLE_SIZE);

		int initialHash=-1;

		while(hash!=initialHash && (table[hash]==DeletedEntry.getUniqueDeletedEntry()|| table[hash]==null && table[hash].getKey()!=key)){


			if(initialHash==-1)
				initialHash=hash;

			hash=(hash+1)%TABLE_SIZE;


		}

		if(hash==initialHash || table[hash]==null)
			return -1;
		else
			return table[hash].getValue();



	}


	public void put(int key, int value){

		int hash=(key%TABLE_SIZE);
		int initialHash=-1;
		int indexOfLastDeletedEntry= -1;

		while(hash!=initialHash && (table[hash]==DeletedEntry.getUniqueDeletedEntry()|| table[hash]!=null && table[hash].getKey()!=key)){

			if(initialHash==-1)
				initialHash=hash;

			if(table[hash]==DeletedEntry.getUniqueDeletedEntry())
				indexOfLastDeletedEntry=hash;

			hash=(hash+1)%TABLE_SIZE;
		}

		if((hash==initialHash||table[hash]==null) && indexOfLastDeletedEntry!=-1)
			table[indexOfLastDeletedEntry]=new HashEntry(key, value);
		else if(hash!=initialHash)
			if (table[hash]!=null && table[hash]!=DeletedEntry.getUniqueDeletedEntry() && table[hash].getKey()==key)
				table[hash].setValue(value);
			else
				table[hash]=new HashEntry(key, value);

	}
	
	public void remove(int key){
		
		int hash=(key%TABLE_SIZE);

		int initialHash=-1;

		while(hash!=initialHash && (table[hash]==DeletedEntry.getUniqueDeletedEntry()|| table[hash]==null && table[hash].getKey()!=key)){


			if(initialHash==-1)
				initialHash=hash;

			hash=(hash+1)%TABLE_SIZE;


		}

		if(hash!=initialHash || table[hash]!=null)
			
			table[hash]=DeletedEntry.getUniqueDeletedEntry();
		
	}

}
