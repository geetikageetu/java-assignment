package test;

 class details{

        public void show()
        {
            System.out.println("Name"+ "     "+"Year of joining"+ "     "+"Address");
            System.out.println("Robert"+ "    "+"1994"+ "             "+"64C-Wallstreet");
            System.out.println("Sam"+ "       "+"2000"+ "             "+"68D-Wallstreet");
            System.out.println("John"+ "      "+"1999"+ "             "+"26B-Wallstreet");

        }
    }
    class A6
    {
        public static void main(String [] args)
        {
            details employee=new details();
            employee.show();
        }

    }