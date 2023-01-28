import java.util.Scanner;


public class Demo{


    public static void main(String[] args){

        Team player = null;
        int choice=0;
        Boolean alive =true;

        Boolean p=false;
        Boolean n=false;

        int pirateFavor;
        int ninjaFavor;



        Scanner kb = new Scanner(System.in);
        System.out.println("INSTANT DEATH BATTLE!!!  ");
        while(choice !=1 ){
            System.out.println("Pirate (1) or Ninja (2)?: ");
            choice =kb.nextInt();
            if (choice==1){
                System.out.println("PIRATE");
                player = new Pirate();
                p = true;
                break;
            }
            else if (choice==2){
                System.out.println("NINJA");
               player = new Ninja();
                n =true;
                break;
            }
        }
        
       
        //gameplay loop
        choice++;
        while (alive ==true){
            System.out.println("What will you do?");
            
            while(choice != 1){
                System.out.println("ATTACK (1) BLOCK (2)");
                choice = kb.nextInt();
                if(choice ==1){
                    break;
                }
                else if (choice==2){
                    break;
                }
            }
            //if pirate or ninja diff text
            if(p == true){
                if (choice ==1){
                    player.attack();
                    pirateFavor =  (int)(Math.random() * 5) + 1;
                    ninjaFavor =  (int)(Math.random() * 5) + 1;
                    if(pirateFavor > ninjaFavor){
                        System.out.println("YOUR A BETTER SHOT WITH THE EYEPATCH!");
                        System.out.println("YOUR SHOT CONNECTED & YOU HAVE SLAIN THE NINJA!!");
                        System.out.println("YOU WON THE INSTANT DEATH BATTLE!!");
                        alive =false;
                    }
                    else if (pirateFavor == ninjaFavor){
                        System.out.println("YOUR ATTACKS HIT AT THE SAME TIME AND YOU BOTH PARRY!!");
                    }
                    else if (pirateFavor < ninjaFavor){
                        System.out.println("YOUR SHOT MISSES AS THE NINJA IS TOO FAST");
                        System.out.println("THE NINJA STRIKES YOU SWIFTY WITH HIS BLADE");
                        System.out.println("YOU HAVE BEEN SLAIN...");
                        System.out.println("YOU LOST THE INSANT DEATH BATTLE!!!");
                        alive =false;
                    }
                }
                else if(choice ==2){
                    player.block();
                    pirateFavor =  (int)(Math.random() * 5) + 1;
                    ninjaFavor =  (int)(Math.random() * 5) + 1;
                    if(pirateFavor > ninjaFavor){
                        System.out.println("YOU RAISED YOUR DEFENSES IN TIME TO BLOCK THE ATTACK");
                        
                    }
                    else if (pirateFavor < ninjaFavor){
                        System.out.println("YOU WERE TOO SLOW AND WERE NOT ABLE TO BLOCK THE NINJAS FLURY OF SWIPES...");
                        System.out.println("THE NINJA STRIKES YOU SWIFTY WITH HIS BLADE");
                        System.out.println("YOU HAVE BEEN SLAIN...");
                        System.out.println("YOU LOST THE INSANT DEATH BATTLE!!!");
                        alive =false;
                    }

                }
            }
            else if (n == true){
                if (choice ==1){
                    player.attack();
                    pirateFavor =  (int)(Math.random() * 5) + 1;
                    ninjaFavor =  (int)(Math.random() * 5) + 1;
                    if(ninjaFavor > pirateFavor){
                        System.out.println("YOUR TRAINING CAME USEFUL YOU SWIFTLY HANDLE BUSINESS");
                        System.out.println("YOUR ATTACKS CONNECT & YOU HAVE SLAIN THE PIRATE!!");
                        System.out.println("YOU WON THE INSTANT DEATH BATTLE!!");
                        alive =false;
                    }
                    else if (ninjaFavor == pirateFavor){
                        System.out.println("YOUR ATTACKS HIT AT THE SAME TIME AND YOU BOTH PARRY!!");
                    }
                    else if (ninjaFavor < pirateFavor){
                        System.out.println("YOU RUSH FOOLISHLY AND MISS YOUR ATTACKS...");
                        System.out.println("THE PIRATE'S SHOT STOPS YOU IN YOUR TRACKS");
                        System.out.println("YOU HAVE BEEN SLAIN...");
                        System.out.println("YOU LOST THE INSANT DEATH BATTLE!!!");
                        alive =false;
                    }
                }
                else if(choice ==2){
                    player.block();
                    pirateFavor =  (int)(Math.random() * 5) + 1;
                    ninjaFavor =  (int)(Math.random() * 5) + 1;
                    if(ninjaFavor > pirateFavor){
                        System.out.println("YOU RAISED YOUR DEFENSES IN TIME TO BLOCK THE ATTACK");
                        
                    }
                    else if (ninjaFavor < pirateFavor){
                        System.out.println("YOU WERE TOO SLOW AND WERE NOT ABLE TO BLOCK PIRATES HOOK");
                        System.out.println("THE PIRATE STRIKES YOU WITH INCREDIBLE FORCE");
                        System.out.println("YOU HAVE BEEN SLAIN...");
                        System.out.println("YOU LOST THE INSANT DEATH BATTLE!!!");
                        alive =false;
                    }

                }
                choice++;
            }
        }
    }
}



    



















