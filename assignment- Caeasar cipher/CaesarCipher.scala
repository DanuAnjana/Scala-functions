object CaesarCipher extends App {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val Encrypt = (c:Char, key:Int, a: String)=> a((a.indexOf(c.toUpper)+key)%a.size)
  val Decrypt = (c:Char, key:Int, a: String)=> a((a.indexOf(c.toUpper)-key + a.size)%a.size)

  val Caesar_cipher = (algo:(Char,Int,String)=> Char,s:String,key:Int,a:String)=> s.map(algo(_,key,a))

  var text:String = "UNIVERSITY"

  val En_text = Caesar_cipher(Encrypt,text,5,alphabet)
  val plain_text = Caesar_cipher(Decrypt,En_text,5,alphabet)

  printf("process data   : %s\n",text)
  printf("Encrypted text : %s\n", En_text)
  printf("Decrypted text : %s", plain_text)
}
