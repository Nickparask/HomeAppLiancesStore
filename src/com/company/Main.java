package com.company;

class HomeAppLiancesStore{

        public static void main (String[]args ){

            // write your code here
            String name=args[0];
            String addres=args[1];
            try{
                int employee= Integer.parseInt(args[2]);
            }
            catch(Exception e){
                System.out.println("Min apodekto  parametron eisosou");
            }

            try{
                System.out.println(args[0]);
            }
            catch(Exception e){
                System.out.println("Den uparxei parametron eisosou");
            }
            try{
                System.out.println(args[1]);
            }
            catch(Exception e){
                System.out.println("Den uparxei parametron eisosou");
            }
            try{
                System.out.println(args[2]);

            }
            catch(Exception e){
                System.out.println("Den uparxei parametron eisosou");
            }



        }

}
