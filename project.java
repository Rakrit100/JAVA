import java.io.*;
public class project
{
   
    public void pro()throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          int check;
        System.out.println("I AM BRAINSTEEN");
        System.out.print("Lets play a game shall we ");
        System.out.println("with your brains (: (; HA!HA!HA!");
        System.out.println("I will show name of some famous personalities");
        System.out.println("Select one of those pesonalities in your mind");
        System.out.println("Answer the questions I ask you sincerely");
        System.out.println("Lest I should take out your brain and eat it.He!He!He!");
        System.out.println("First I will tell you how to play");
        System.out.println("Names of fifty one famous personalities will be shown now");
        System.out.println("For my every question answer as true or false");
        System.out.println("For 'true' enter'1'");
        System.out.println("and for 'false' enter '2'");
        System.out.println("No other number will be accepted");
        System.out.println("If you play by the rules only good will come to your way");
        System.out.println("");
        System.out.println("Enter 1 for the name to be displayed.");
        check=Integer.valueOf(br.readLine());
        if(check==1)
        {
            for( ; ; )
            {
        System.out.println("So here are the names of 51 famous pesonalities");
        System.out.print("Donald Trump                 ");
        System.out.println("Barack Obama");
        System.out.print("Osama Bin Laden              ");
        System.out.println("J.K.Rowling");
        System.out.print("Kim Jong Un                  ");
        System.out.println("Usain Bolt");
        System.out.print("Malala Yousafzai             ");
        System.out.println("Stephen Hawking");
        System.out.print("Steve Jobs                   ");
        System.out.println("Queen Elizabeth II");
        System.out.print("Lional Messi                 ");
        System.out.println("M.S.Dohni");
        System.out.print("Camilo Cabello               ");
        System.out.println("Sachin Tendulkar");
        System.out.print("Emma Watson                  ");
        System.out.println("Lady Gaga");
        System.out.print("Halsey                       ");
        System.out.println("Will Smith");
        System.out.print("Larry Page                   ");
        System.out.println("Sergey Brin");
        System.out.print("Shakira                      ");
        System.out.println("Dwayne Johnson");
        System.out.print("Mark Zuckerberg              ");
        System.out.println("Bill Gates");
        System.out.print("Mahatma Gandhi               ");
        System.out.println("Robert Downey Jr");
        System.out.print("Roger Federer                ");
        System.out.println("Xi Jinping");
        System.out.print("Nelson Mandela               ");
        System.out.println("Serena Williams");
        System.out.print("Abraham Lincoln              ");
        System.out.println("Marie Curie");
        System.out.print("Muhammad Ali                 ");
        System.out.println("Charles Darwin");
        System.out.print("Pope Francis                 ");
        System.out.println("Elvis Presley");
        System.out.print("Albert Einstein              ");
        System.out.println("Leonardo da Vinci");
        System.out.print("Vincent Van Gogh             ");
        System.out.println("Chetan Bhagat");
        System.out.print("Narendra Modi                ");
        System.out.println("Thomas Edision");
        System.out.print("George Orwell                ");
        System.out.println("Pele");
        System.out.print("Henry Ford                   ");
        System.out.println("Michael Jordon");
        System.out.print("Fidel Castro                 ");
        System.out.println("Pablo Picasso");
        System.out.print("Adolf Hitler                 ");
        System.out.println("Anne Frank");
        System.out.println("Luis Fonsi");
        System.out.println("If you have chosen lets continue");
        System.out.println("Enter '1' for the questions to appear");
        int check1 =Integer.parseInt(br.readLine());
        if(check1==1)
        {
            System.out.println("Was the person chossen by you a Terrorist?");
            int a =Integer.parseInt(br.readLine());
           if(a==1)
           {
           System.out.println("So the person choosen by you Osama Bin Laden");
            }
        if(a==2)
        {
         System.out.println("Oh my bad, I thought you where a Terrorist and so you choose a Terrorist.");
        System.out.println("Ok so I which of the given catorgery does your choosen personality belong to");
        System.out.println("Give me a clue but no wrong clues");
        System.out.println("1.Politics 2. Books 3. Sports 4. Peace and Non violence 5. Scientest 6. Business and Entrepreneur 7.Acting 8.Singer 9.Painting");
        int b =Integer.parseInt(br.readLine());
          switch(b)
          {
              case 1:System.out.println("Ah Politics!");
                     System.out.println("So let me guess is the personality was atleast once the President of America");
                     int c =Integer.parseInt(br.readLine());
              if(c==1)
              {
              System.out.println("Is that person the current President of America");
               int d =Integer.parseInt(br.readLine());
               if(d==1)
               { 
               System.out.println("So you have choosen Donald Trump");
               break;
               }
               if(d==2)
               {
                System.out.println("Did that person become the President of America twice");
               int e =Integer.parseInt(br.readLine());
                if(e==1)
               {
                System.out.println("So you have choosen Barak Obama");
                break;
               }
               if(e==2)
                {
                System.out.println("Is that person dead");
                 int f =Integer.parseInt(br.readLine());
               if(f==1)
              {
               System.out.println("So you have choosen Abraham Lincoln");
               break;
              }
               else
               {
               System.out.println("Invalid choice");
               break;
            }
                        }
            }
           }
            if(c==2)
            {
               System.out.println("Is that person a dictator");
               int g =Integer.parseInt(br.readLine());
             if(g==1)
             {
               System.out.println("Was he the dictator of Germany");
               int h =Integer.parseInt(br.readLine());
              if(h==1)
             {
               System.out.println("So you have choosen Adolf Hitler");
               break;
              }              
               if(h==2)
               {
               System.out.println("So you have choosen Fidel Castro");
               break;
              }              
              }
             if(g==2)
             {
                  System.out.println("Is that person the current President of North Korea");
               int i =Integer.parseInt(br.readLine());
               if(i==1)
              {
               System.out.println("So you have choosen Kim Jong Un");
              break;
            }
            if(i==2)
              {
               System.out.println("Is that person a Queen");
               int j =Integer.parseInt(br.readLine());
              if(j==1)
              {
               System.out.println("So you have choosen Queen Elizibeth II");
               break;
               }
               if(j==2)
               {
                 System.out.println("Is that person the current president of China");
                int k =Integer.parseInt(br.readLine());
                   if(k==1)
                 {
                  System.out.println("So you have choosen Xi Jinping");
                  break;
                  }
                  if(k==2)
                  {
                  System.out.println("Is he Indian");
                  int l =Integer.parseInt(br.readLine());
                   if(l==1)
                 {
                  System.out.println("Ah Modi, Narendra Modi. Took some time but got it");
                  break;
                }
                else
                {
                System.out.println("Invalid Choice");
                break;
            }
                }
               }
              }
             }
            }
            break;
               
               case 2: System.out.println("Oh Books. Authors!");
                     System.out.println("Is that person Indian");
                int m =Integer.parseInt(br.readLine());
                  if(m==1)
                 { 
                   System.out.println("So you have choosen Chetan Bhagat");
                   break;
                 }
                 if(m==2)
                 {
                     System.out.println("Is the author famous for creating the character Harry Potter");
                     int n =Integer.parseInt(br.readLine());
                   if(n==1)
                 {
                     System.out.println("So you have choosen J.K.Rowling");
                   break;
                  }
                  if(n==2)
                  {
                      System.out.println("Is the author famous for the book Animal Farm");
                      int o =Integer.parseInt(br.readLine());
                   if(o==1)
                   {     
                     
                     System.out.println("So you have choosen George Orwell");
                    break;
                   }
                   if(o==2)
                  {
                      System.out.println("Is the author a kid and dead");
                      int p =Integer.parseInt(br.readLine());
                   if(p==1)
                   {     
                     
                     System.out.println("So you have choosen Anne Frank");
                    break;
                   }
                     else
                     {
                         System.out.println("Invalid Choice");
                      break;
                    }
                    }
                 }
                }
                break;
              
                case 3:System.out.println("Oh, Sports.");
                        System.out.println("I don't play Sports so please excuse me if I make any mistake.");
                        System.out.println("Is your person a footballer?");
                        int q=Integer.parseInt(br.readLine());
                
                  if(q==1)
                   {
                      System.out.println("Does the player still play? ");
                      int r =Integer.parseInt(br.readLine());
                   if(r==1)
                   {     
                     System.out.println("So you have choosen Lionel Messi");
                     break;
                    }
                    else
                    {
                        System.out.println("So you have choosen Pele");
                        break;
                    }
                  }
                  if(q==2)
                  {
                      System.out.println("Is the person a Athlete");
                      int r =Integer.parseInt(br.readLine());
                   if(r==1)
                   {     
                     
                     System.out.println("So you have choosen Usain Bolt");
                    break;
                   }
                   if(r==2)
                   {
                      System.out.println("Is the choosen person a cricketer ");
                      int s =Integer.parseInt(br.readLine());
                     if(s==1)
                     {                
                  
                     System.out.println("Is the choosen person famous for having 100 centuries.");
                      int t =Integer.parseInt(br.readLine());
                     if(t==1)
                     {     
                     
                      System.out.println("So you have choosen Sachin Tendulkar");
                      break;
                     }
                     if(t==2)
                     {
                         System.out.println("So you have choosen M.S.Dohni");
                         break;
                        }
                       if(s==2)
                  {
                      System.out.println("Does your choosen person play tennis");
                      int u =Integer.parseInt(br.readLine());
                   if(u==1)
                   {     
                     
                     System.out.println("Is your choosen person a Swiss player");
                    int v=Integer.parseInt(br.readLine());
    
                    if(v==1)
                    { 
                     System.out.println("So you have choose Roger Federer");
                     break;
                    }
                    if(v==2)
                    {
                        System.out.println("So you have choose Serena Williams");
                        break;
                    }
                   if(u==2)
                  {
                      System.out.println("Is the choosen person a basketball player");
                      int w =Integer.parseInt(br.readLine());
                   if(w==1)
                   {     
                     
                     System.out.println("So you have choosen Michael Jordan");
                    break;
                    }
                    if(w==2)
                    {
                       System.out.println("Invalid choice");
                       break;
                    }
                   }
                  }
                 }
                }
               }
              }
              break;
                   case 4:System.out.println("Oh. Peace and Non Violence");  
                     System.out.println("I just remembered an old saying,'Spread Love and not War'.");
                      System.out.println("I am a follower of that saying");
                      System.out.println("Is the choosen person Indian");
                      int x=Integer.parseInt(br.readLine());
                      if(x==1)
                       {
                          System.out.println("So you have choosen Mahatma Gandhi");
                          break;
                        }
                        if(x==2)
                  {
                      System.out.println("Is the choosen person a Vatican Pope");
                      int y =Integer.parseInt(br.readLine());
                   if(y==1)
                   {     
                     
                     System.out.println("So you have choosen Pope Francis");
                    break;
                    }
                    if(y==2)
                   {
                       System.out.println("Is the choosen person a Black, I mean no Racisism");
                       int z =Integer.parseInt(br.readLine());
                      if(z==1)
                      {     
                     
                       System.out.println("So you have choosen Nelson Mandela");
                       break;
                      }
                     if(z==2)
                     {
                      System.out.println("Is the choosen person a Girl who was shot in the brain and yet surived");
                      int aa =Integer.parseInt(br.readLine());
                       if(aa==1)
                       {     
                     
                        System.out.println("So you have choosen Malala Yousafzai");
                        break;
                       }
                      if(aa==2)
                      {
                       System.out.println("Invalid Choice");
                       break;
                      }
                    }
                   }
                  }
                    break;
                    
                    
                    case 5:System.out.println("Ah, Scientest");  
                     System.out.println("I wanted to be one scientest since I was a Kid.");
                      System.out.println("Was the choosen person paralysed");
                      int ab=Integer.parseInt(br.readLine());
                      if(ab==1)
                       {
                          System.out.println("So you have choosen Stephan Hawking");
                          break;
                        }
                        if(ab==2)
                  {
                      System.out.println("Is the choosen person a Biolgist");
                      int ac =Integer.parseInt(br.readLine());
                   if(ac==1)
                   {     
                     
                     System.out.println("So you have choosen Charles Darwin");
                    break;
                    }
                    if(ac==2)
                   {
                       System.out.println("Did the chossen person die of Radiation");
                       int ad =Integer.parseInt(br.readLine());
                      if(ad==1)
                      {     
                     
                       System.out.println("So you have choosen Marie Curie");
                       break;
                      }
                     if(ad==2)
                     {
                      System.out.println("Did the person chossen by you found the Theory of Relativity");
                      int ae =Integer.parseInt(br.readLine());
                       if(ae==1)
                       {     
                     
                        System.out.println("So you have choosen Albert Einstein");
                        break;
                       }
                      
                    if(ae==2)
                     {
                      System.out.println("Did the person chossen by you invent light bulb");
                      int af =Integer.parseInt(br.readLine());
                       if(af==1)
                       {     
                     
                        System.out.println("So you have choosen Thomas Edison");
                        break;
                       }
                      if(af==2)
                      {
                       System.out.println("Invalid Choice");
                       break;
                      }
                    }
                }
                   }
                  }
                    break;
                    
                   case 6:System.out.println("Ah, Business and Entrepreneur");  
                     System.out.println("Just think of the money an Entrepreneur have");
                      System.out.println("Is the choosen person founded of a company name after a fruit");
                      int ag=Integer.parseInt(br.readLine());
                      if(ag==1)
                       {
                          System.out.println("So you have choosen Steve Jobs");
                          break;
                        }
                        if(ag==2)
                  {
                      System.out.println("Is the choosen person one of the Co_founder of Google ");
                      int ah =Integer.parseInt(br.readLine());
                   if(ah==1)
                   {     
                     
                     System.out.println("Is he Larry Page");
                       int ai =Integer.parseInt(br.readLine());
                      if(ai==1)
                      {     
                       break;
                      }
                     if(ai==2)
                     {
                        System.out.println("So you have choosen Sergey Brin");
                        break;
                       }
                       }
                    if(ah==2)
                     {
                      System.out.println("Is the person chossen by you owner of FaceBook");
                      int aj =Integer.parseInt(br.readLine());
                       if(aj==1)
                       {     
                     
                        System.out.println("So you have choosen Mark Zuckerberg");
                        break;
                       }
                      if(aj==2)
                      {
                          System.out.println("Is the person choosen by you the founder of the company Ford motors");
                          int ak=Integer.parseInt(br.readLine());
                          if(ak==1)
                          {
                          System.out.println("So you have choosen Henry Ford");
                          break;
                           }
                        if(ak==2)
                      {
                          System.out.println("Is the person choosen by you the create of Microsoft");
                          int al=Integer.parseInt(br.readLine());
                          if(al==1)
                          {
                          System.out.println("So you have choosen Bill Gates");
                          break;
                          }
                          if(al==2)
                          {
                              System.out.println("Invalid choice");
                              break;
                            }
                        }
                      }
                     }
                    }
                    break;
                    case 7:System.out.println("Actors. Nice");  
                     System.out.println("Is the choosen person famously know as Hermione");
                      int am=Integer.parseInt(br.readLine());
                      if(am==1)
                       {
                          System.out.println("So you have choosen Emma Watson");
                         break;
                        }
                        if(am==2)
                  {
                      System.out.println("Did the choosen person act as Deadshot in Suicide Squad and as Genie in Aladin movie");
                      int an =Integer.parseInt(br.readLine());
                   if(an==1)
                   {     
                     
                     System.out.println("So you have choosen Will Smith");
                    break;
                    }
                    if(an==2)
                   {
                       System.out.println("Is the choosen person popularly known as 'The Rock'");
                       int ao =Integer.parseInt(br.readLine());
                      if(ao==1)
                      {     
                     
                       System.out.println("So you have choosen Dwayne Johnson");
                      break;
                      }
                     if(ao==2)
                     {
                      System.out.println("Did the choosen person act as Iron Man aka Antony Howard Stark");
                      int ap =Integer.parseInt(br.readLine());
                       if(ap==1)
                       {     
                     
                        System.out.println("So you have choosen Robert Downey Jr.");
                        break;
                       }
                      if(ap==2)
                      {
                       System.out.println("Invalid Choice");
                       break;
                      }
                    }
                   }
                  }
                    break;
                    case 8:System.out.println("Singers. Ooo Lala");  
                    System.out.println("Did the choosen person win Oscar for the song in the Song 'A Star is Born'");
                      int aq=Integer.parseInt(br.readLine());
                      if(aq==1)
                       {
                          System.out.println("So you have choosen Lady Gaga");
                          break;
                        }
                        if(aq==2)
                  {
                      System.out.println("Is the choosen person known for the song 'Without Me'.");
                      int ar =Integer.parseInt(br.readLine());
                   if(ar==1)
                   {     
                     
                     System.out.println("So you have choosen Halsey");
                    break;
                    }
                    if(ar==2)
                   {
                       System.out.println("Is the chossen person Dead");
                       int as =Integer.parseInt(br.readLine());
                      if(as==1)
                      {     
                     
                       System.out.println("So you have choosen Elvis Presley");
                       break;
                      }
                     if(as==2)
                     {
                      System.out.println("Was the person chossen by you a former member of Fifth Harmoney and Sing the famous song 'Havana'");
                      int at =Integer.parseInt(br.readLine());
                       if(at==1)
                       {     
                     
                        System.out.println("So you have choosen Camilo Cabello");
                        break;
                       }
                      
                    if(at==2)
                     {
                      System.out.println("Did the person chossen by you along with Daddy Yankee sang a song which is the highest seen Music Video in Youtube");
                      int au =Integer.parseInt(br.readLine());
                       if(au==1)
                       {     
                     
                        System.out.println("So you have choosen Luis Fonsi");
                        break;
                       }
                      if(au==2)
                      {
                          System.out.println("Did the person chossen by you sing the 2014 FIFA world cup theme song");
                      int av =Integer.parseInt(br.readLine());
                       if(av==1)
                       {     
                     
                        System.out.println("So you have choosen Shakira");
                        break;
                       }
                        if(av==2)
                        {
                       System.out.println("Invalid Choice");
                       break;
                       }
                      }
                     }
                    }
                   }
                  }
                    break; 
                    case 9: System.out.println("Paintings. Nice Choice");
                    System.out.println("Did the person chossen by you paint the famous 'Mona Lisa' and 'The Last Supper'");
                      int aw =Integer.parseInt(br.readLine());
                       if(aw==1)
                       {     
                     
                        System.out.println("So you have choosen Leonardo da Vinci");
                        break;
                       }
                      
                    if(aw==2)
                     {
                      System.out.println("Is the person chossen by you Spanish");
                      int ax =Integer.parseInt(br.readLine());
                       if(ax==1)
                       {     
                     
                        System.out.println("So you have choosen Pablo Picasso");
                        break;
                       }
                      if(ax==2)
                      {
                          System.out.println("Did the person chossen by you cut of his left ear");
                      int ay =Integer.parseInt(br.readLine());
                       if(ay==1)
                       {     
                     
                        System.out.println("So you have choosen Vincent van Gogh");
                        break;
                       }
                        if(ay==2)
                        {
                       System.out.println("Invalid Choice");
                       break;
                      }
                    }
                   }
                   break;
                  }
                 }
                }
                System.out.println("");
                System.out.println("");
                 System.out.println("Do you want to play again");
                      int yy =Integer.parseInt(br.readLine());
                 if(yy==2)
                 System.exit(0);
                }
               }
             }
    
             
            } 
                