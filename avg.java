class avg
{
  public static void main(String a[])
{
  double s1=90,s2=95,s3=98,s4=99,s5=89;
  double b;
  b=(s1+s2+s3+s4+s5)*100/500;
  
  System.out.println("Arange of 5 subjest is ="+b);
  
  if(b>90)
  {
	  System.out.println("A grade");
  }
  else if(b>80&&b<90)
  {
	  System.out.println("B grade");
	  
  }
  else if(b>70&&b<80)
  {
	  
	  System.out.println("C grade");
	  
  }
  
  else
  { System.out.println("pass");
  }
}  

}
