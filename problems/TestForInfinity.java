package problems;

public class TestForInfinity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String c1="315c4eeaa8b5f8aaf9174145bf43e1784b8fa00dc71d885a804e5ee9fa40b16349c146fb778cdf2d3aff021dfff5b403b510d0d0455468aeb98622b137dae857553ccd8883a7bc37520e06e515d22c954eba5025b8cc57ee59418ce7dc6bc41556bdb36bbca3e8774301fbcaa3b83b220809560987815f65286764703de0f3d524400a19b159610b11ef3e";
		String c2="234c02ecbbfbafa3ed18510abd11fa724fcda2018a1a8342cf064bbde548b12b07df44ba7191d9606ef4081ffde5ad46a5069d9f7f543bedb9c861bf29c7e205132eda9382b0bc2c5c4b45f919cf3a9f1cb74151f6d551f4480c82b2cb24cc5b028aa76eb7b4ab24171ab3cdadb8356f";
		String c3="32510ba9a7b2bba9b8005d43a304b5714cc0bb0c8a34884dd91304b8ad40b62b07df44ba6e9d8a2368e51d04e0e7b207b70b9b8261112bacb6c866a232dfe257527dc29398f5f3251a0d47e503c66e935de81230b59b7afb5f41afa8d661cb";
		String c4="32510ba9aab2a8a4fd06414fb517b5605cc0aa0dc91a8908c2064ba8ad5ea06a029056f47a8ad3306ef5021eafe1ac01a81197847a5c68a1b78769a37bc8f4575432c198ccb4ef63590256e305cd3a9544ee4160ead45aef520489e7da7d835402bca670bda8eb775200b8dabbba246b130f040d8ec6447e2c767f3d30ed81ea2e4c1404e1315a1010e7229be6636aaa";
		String c5="3f561ba9adb4b6ebec54424ba317b564418fac0dd35f8c08d31a1fe9e24fe56808c213f17c81d9607cee021dafe1e001b21ade877a5e68bea88d61b93ac5ee0d562e8e9582f5ef375f0a4ae20ed86e935de81230b59b73fb4302cd95d770c65b40aaa065f2a5e33a5a0bb5dcaba43722130f042f8ec85b7c2070";
		String c6="32510bfbacfbb9befd54415da243e1695ecabd58c519cd4bd2061bbde24eb76a19d84aba34d8de287be84d07e7e9a30ee714979c7e1123a8bd9822a33ecaf512472e8e8f8db3f9635c1949e640c621854eba0d79eccf52ff111284b4cc61d11902aebc66f2b2e436434eacc0aba938220b084800c2ca4e693522643573b2c4ce35050b0cf774201f0fe52ac9f26d71b6cf61a711cc229f77ace7aa88a2f19983122b11be87a59c355d25f8e4";
		String c7="32510bfbacfbb9befd54415da243e1695ecabd58c519cd4bd90f1fa6ea5ba47b01c909ba7696cf606ef40c04afe1ac0aa8148dd066592ded9f8774b529c7ea125d298e8883f5e9305f4b44f915cb2bd05af51373fd9b4af511039fa2d96f83414aaaf261bda2e97b170fb5cce2a53e675c154c0d9681596934777e2275b381ce2e40582afe67650b13e72287ff2270abcf73bb028932836fbdecfecee0a3b894473c1bbeb6b4913a536ce4f9b13f1efff71ea313c8661dd9a4ce";
		String c8="315c4eeaa8b5f8bffd11155ea506b56041c6a00c8a08854dd21a4bbde54ce56801d943ba708b8a3574f40c00fff9e00fa1439fd0654327a3bfc860b92f89ee04132ecb9298f5fd2d5e4b45e40ecc3b9d59e9417df7c95bba410e9aa2ca24c5474da2f276baa3ac325918b2daada43d6712150441c2e04f6565517f317da9d3";
		String c9="271946f9bbb2aeadec111841a81abc300ecaa01bd8069d5cc91005e9fe4aad6e04d513e96d99de2569bc5e50eeeca709b50a8a987f4264edb6896fb537d0a716132ddc938fb0f836480e06ed0fcd6e9759f40462f9cf57f4564186a2c1778f1543efa270bda5e933421cbe88a4a52222190f471e9bd15f652b653b7071aec59a2705081ffe72651d08f822c9ed6d76e48b63ab15d0208573a7eef027";
		String c10="466d06ece998b7a2fb1d464fed2ced7641ddaa3cc31c9941cf110abbf409ed39598005b3399ccfafb61d0315fca0a314be138a9f32503bedac8067f03adbf3575c3b8edc9ba7f537530541ab0f9f3cd04ff50d66f1d559ba520e89a2cb2a83";
		String q="32510ba9babebbbefd001547a810e67149caee11d945cd7fc81a05e9f85aac650e9052ba6a8cd8257bf14d13e6f0a803b54fde9e77472dbff89d71b57bddef121336cb85ccb8f3315f4b52e301d16e9f52f904";
		String rc1=c1.substring(0, 166);
		String rc2=c2.substring(0, 166);
		String rc3=c3.substring(0, 166);
		String rc4=c4.substring(0, 166);
		String rc5=c5.substring(0, 166);
		String rc6=c6.substring(0, 166);
		String rc7=c7.substring(0, 166);
		String rc8=c8.substring(0, 166);
		String rc9=c9.substring(0, 166);
		String rc10=c10.substring(0, 166);




		String key[]=new String[88];
		String secret[]=new String[88];

		for (int i=0; i<key.length;i++){

			key[i]="  ";

		}
		for (int i=0; i<secret.length;i++){

			secret[i]="  ";

		}





		check(xorHex(rc1, rc2), xorHex(rc1, rc3), xorHex(rc1, rc4), xorHex(rc1, rc5), xorHex(rc1, rc6), xorHex(rc1, rc7), xorHex(rc1, rc8), xorHex(rc1, rc9), xorHex(rc1, rc10),  key, rc1, q, secret);
		check(xorHex(rc2, rc1), xorHex(rc2, rc3), xorHex(rc2, rc4), xorHex(rc2, rc5), xorHex(rc2, rc6), xorHex(rc2, rc7), xorHex(rc2, rc8), xorHex(rc2, rc9), xorHex(rc2, rc10),  key, rc2, q, secret);
		check(xorHex(rc3, rc1), xorHex(rc3, rc2), xorHex(rc3, rc4), xorHex(rc3, rc5), xorHex(rc3, rc6), xorHex(rc3, rc7), xorHex(rc3, rc8), xorHex(rc3, rc9), xorHex(rc3, rc10),  key, rc3, q, secret);
		check(xorHex(rc4, rc1), xorHex(rc4, rc3), xorHex(rc4, rc2), xorHex(rc4, rc5), xorHex(rc4, rc6), xorHex(rc4, rc7), xorHex(rc4, rc8), xorHex(rc4, rc9), xorHex(rc4, rc10),  key, rc4, q, secret);
		check(xorHex(rc5, rc1), xorHex(rc5, rc3), xorHex(rc5, rc4), xorHex(rc5, rc2), xorHex(rc5, rc6), xorHex(rc5, rc7), xorHex(rc5, rc8), xorHex(rc5, rc9), xorHex(rc5, rc10),  key, rc5, q, secret);
		check(xorHex(rc6, rc1), xorHex(rc6, rc3), xorHex(rc6, rc4), xorHex(rc6, rc5), xorHex(rc6, rc2), xorHex(rc6, rc7), xorHex(rc6, rc8), xorHex(rc6, rc9), xorHex(rc6, rc10),  key, rc6, q, secret);
		check(xorHex(rc7, rc1), xorHex(rc7, rc3), xorHex(rc7, rc4), xorHex(rc7, rc5), xorHex(rc7, rc6), xorHex(rc7, rc2), xorHex(rc7, rc8), xorHex(rc7, rc9), xorHex(rc7, rc10),  key, rc7, q, secret);
		check(xorHex(rc8, rc1), xorHex(rc8, rc3), xorHex(rc8, rc4), xorHex(rc8, rc5), xorHex(rc8, rc6), xorHex(rc8, rc7), xorHex(rc8, rc2), xorHex(rc8, rc9), xorHex(rc8, rc10),  key, rc8, q, secret);
		check(xorHex(rc9, rc1), xorHex(rc9, rc3), xorHex(rc9, rc4), xorHex(rc9, rc5), xorHex(rc9, rc6), xorHex(rc9, rc7), xorHex(rc9, rc8), xorHex(rc9, rc2), xorHex(rc9, rc10),  key, rc9, q, secret);
		check(xorHex(rc10, rc1), xorHex(rc10, rc3), xorHex(rc10, rc4), xorHex(rc10, rc5), xorHex(rc10, rc6), xorHex(rc10, rc7), xorHex(rc10, rc8), xorHex(rc10, rc9), xorHex(rc10, rc2),  key, rc10, q, secret);
		//check(xorHex(q, rc1), xorHex(q, rc3), xorHex(q, rc4), xorHex(q, rc5), xorHex(q, rc6), xorHex(q, rc7), xorHex(q, rc8), xorHex(q, rc9), xorHex(q, rc2),  key, q, q, secret);

		//System.out.println(xorHex(rc1, rc2));

		for (int i=0; i<key.length;i++){

			System.out.print(key[i]);

		}
		
		System.out.println("\n");

		for (int i=0; i<secret.length;i++){

			System.out.print(secret[i]);

		}
		//System.out.println(q.length()==key.length);

	}


	public static String xorHex(String a, String b) {
		// TODO: Validation
		char[] chars = new char[a.length()];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = toHex(fromHex(a.charAt(i)) ^ fromHex(b.charAt(i)));
		}
		return new String(chars);
	}

	private static int fromHex(char c) {
		if (c >= '0' && c <= '9') {
			return c - '0';
		}
		if (c >= 'A' && c <= 'F') {
			return c - 'A' + 10;
		}
		if (c >= 'a' && c <= 'f') {
			return c - 'a' + 10;
		}
		throw new IllegalArgumentException();
	}

	private static char toHex(int nybble) {
		if (nybble < 0 || nybble > 15) {
			throw new IllegalArgumentException();
		}
		return "0123456789ABCDEF".charAt(nybble);
	}
	
	public static String convertHexToString(String hex){
		 
		  StringBuilder sb = new StringBuilder();
		  StringBuilder temp = new StringBuilder();
	 
		  //49204c6f7665204a617661 split into two characters 49, 20, 4c...
		  for( int i=0; i<hex.length()-1; i+=2 ){
	 
		      //grab the hex in pairs
		      String output = hex.substring(i, (i + 2));
		      //convert hex to decimal
		      int decimal = Integer.parseInt(output, 16);
		      //convert the decimal to character
		      sb.append((char)decimal);
	 
		      temp.append(decimal);
		  }
		  //System.out.println("Decimal : " + temp.toString());
	 
		  return sb.toString();
	  }


	public static void check(String a, String b, String c, String d, String e, String f, String g, String h, String i, String[] key, String cipher, String q, String[] secret){

		for(int j=0; j<a.length(); j+=2){

			String subA=a.substring(j, j+2);
			String subB=b.substring(j, j+2);
			String subC=c.substring(j, j+2);
			String subD=d.substring(j, j+2);
			String subE=e.substring(j, j+2);
			String subF=f.substring(j, j+2);
			String subG=g.substring(j, j+2);
			String subH=h.substring(j, j+2);
			String subI=i.substring(j, j+2);

			String subCipher=cipher.substring(j, j+2);
			String subQ=q.substring(j, j+2);

			int A=Integer.parseInt(subA, 16);
			int B=Integer.parseInt(subB, 16);
			int C=Integer.parseInt(subC, 16);
			int D=Integer.parseInt(subD, 16);
			int E=Integer.parseInt(subE, 16);
			int F=Integer.parseInt(subF, 16);
			int G=Integer.parseInt(subG, 16);
			int H=Integer.parseInt(subH, 16);
			int I=Integer.parseInt(subI, 16);

			if((A>=65 && A<=122) && (H>=65 && H<=122) && (I>=65 && I<=122) ){

				key[j/2]=xorHex(subCipher, "20");
				secret[j/2]=convertHexToString(xorHex(key[j/2], subQ));
				//System.out.println("Index of space : "+((j)+1)+"   "+subA+"   "+subB+"   "+subC);

			}



		}



	}



}
