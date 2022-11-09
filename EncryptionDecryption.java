//Encryption class
public class passwordEncryption {
    
   private static String getEncryptedValue(String value, int secret_key) {
		String encrypt = "";
		for (int i = 0; i < value.length(); i++) {
			char ch = value.charAt(i);
			ch += secret_key;
			encrypt = encrypt+ch;
		}
		return encrypt;
	}
}

//Decryption class
public class passwordDecryption{
	private static String getDecryptedValue(String encrypt, int secret_key) {
		String decrypted = "";
		for(int i =0; i < encrypt.length();i++) {
			char ch = encrypt.charAt(i);
			ch -= secret_key;
			decrypted = decrypted + ch;
		}
		return decrypted;
	}
}


//Encrytion button
 try {
            
              String simplepasswd= JOptionPane.showInputDialog("Please Enter your password to encrypt");
             if (!simplepasswd.isEmpty()) {
                 
                                int secret_key=8;
                                String encPass = passwordEncryption.getEncryptedValue(simplepasswd, secret_key);
                                //txtArea adding in the panel
                               JTextArea encryptPasswdArea = new JTextArea(3, 10);
                                textArea(encPass, encryptPasswdArea);
                                JOptionPane.showMessageDialog(this, new JScrollPane(encryptPasswdArea), "Copy your Encrypted password", JOptionPane.INFORMATION_MESSAGE);
                            } 
             
             else 
             {JOptionPane.showMessageDialog(this, "Please enter password!");
             }
             
            
          
            
        } catch (Exception e) {
//              JOptionPane.showMessageDialog(this, e.getMessage(), "EXIT", JOptionPane.ERROR_MESSAGE);
              
        }
        
        
        //Decryption class
        {
         String decrypt= JOptionPane.showInputDialog("Please Enter The Password To Be Decrypted");
           
           if(!decrypt.isEmpty())
           {
               
               int secret_key=8;
                String decpass = passwordDecryption.getDecryptedValue(decrypt, secret_key);
                                //txtArea adding in the panel
                               JTextArea encryptPasswdArea = new JTextArea(3, 10);
                                textArea(decpass, encryptPasswdArea);
                                JOptionPane.showMessageDialog(this, new JScrollPane(encryptPasswdArea), "Copy your Encrypted password", JOptionPane.INFORMATION_MESSAGE);
                            
               
               
           }
           }
           
        
        
        
