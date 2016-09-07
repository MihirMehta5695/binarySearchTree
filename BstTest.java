package binarySearchTree;

import java.util.Scanner;

public class BstTest 
{

	public static void main(String[] args)
	{
				BinarySearchTree ll=new BinarySearchTree();//creating an object of SinglyLinkedClass
				Scanner sc=new Scanner(System.in);//Creating an object of scanner class to read input from user
				int choice;//to hold the choice of user
				int value,key;
				while(true)
				{
					
					System.out.println("\n\n\n\n\n");
					System.out.println("-------------------MENU--------------------");
					System.out.println("1)  Create Tree");
					System.out.println("2)  Insert value in the Binary Search Tree");
					System.out.println("3)  Delete the node having the specified Value from the Binary Search Tree");
					//System.out.println("4)  Find existence of a node having the specified value in the binary search Tree");
					System.out.println("4)  Display the Entire Tree PreOrder");
					System.out.println("5)  Display the Entire Tree InOrder");
					System.out.println("6)  Display the Entire Tree PostOrder");
					System.out.println("7)  Count the nodes in the Entire Tree");
					System.out.println("8)  Delete and Empty entire Binary Search Tree");
					System.out.println("9)  Exit the program");
					System.out.println("---------------END OF MENU-----------------");
					System.out.println("\n\nEnter your choice : ");
					
					choice=sc.nextInt();//Inputting the user choice
					
					switch(choice)
					{
					
					 case 1:
						 		ll.createTree();
						 		break;
					
					 case 2:
						 		System.out.println("Enter the value to insert : ");
						 		value=sc.nextInt();
						 		ll.insert(value);
						 		break;
						 		
					 case 3:
						 		System.out.println("Enter the value : ");
						 		value=sc.nextInt();
						 		ll.delete(value);
						 		break;
						 		
					 case 4:
						 		ll.display(choice);
						 		break;
						 		
					 case 5:	
								ll.display(choice);
							 	break;
					 		
					 case 6:
						 		ll.display(choice);
						 		break;
					 		
					 case 7:
						 		ll.countAll();
					 			break;
					 		
					 case 8:
						 		ll.emptyTree();
					 			break;
					
					 case 9:
						 		System.exit(0);
					 			break;
					 		
					 default:	
						 		System.out.println("Enter a valid choice !!!!");
						 		break;
					 			
						 		
						 		
						 		
					}//End of switch stmt
					
					
				}//end of while loop
				
			}//end of main method(.)
			
		}//end of BstTest class

		
	