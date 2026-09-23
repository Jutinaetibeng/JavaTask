import java.util.Scanner;

public class Nokia{
	public static void main(String[] args){

		Scanner inputCollector = new Scanner(System.in);


		System.out.println("main Menu");
		System.out.println("selsect a choice");
	String mainMenu = """

			1.	Phonebook
			2.	Messages
			3.	Chat
			4.  Call register 
			5.  Tones 
			6.  Settings
			7.  Call divert 
			8.  Music
			9.  Games
			10. Calculator 
			11. Reminders
			12. Clock 
			13. Profiles 
			14. Services 
			15. SIM services
				""";

				System.out.print(mainMenu);
				int mainMenuChoice = inputCollector.nextInt();

				switch (mainMenuChoice){

				case 1:
					System.out.println("Phonebook");

			String phonebookMainMenu = """
				1. Search
				2. Service Nos.
				3. Add name
				4. Eras	
				5. Edit
				6. Copy
				7. Assign tone
				8. Send b’card
				9. option 
				10. Speed dials
				11. Voice tags
					""";

					System.out.println(phonebookMainMenu );
					int phonebookMenuChoice =inputCollector.nextInt();
					switch (phonebookMenuChoice){
				case 1:
					System.out.println("Search"); break;

				case 2:
					System.out.println("services"); break;

				case 3:
					System.out.println("Add name"); break;

				case 4:
					System.out.println("Eras"); break;

				case 5:
					System.out.println("Edit"); break;

				case 6:
					System.out.println("Copy"); break;

				case 7:
					System.out.println("Assign tone"); break;

				case 8:
					System.out.println("Send b’card"); break;

				case 9:
					System.out.println("options");

				String optionsMenu ="""
					1. Memory in use
					2. Type of view
					3. Memory status
						""";
						System.out.println(optionsMenu);
				int optionsMenuChoice = inputCollector.nextInt();
					switch (optionsMenuChoice){
				case 1:
					System.out.println("Memory in use"); break;

				case 2:
					System.out.println("Type of view"); break;

				case 3:
					System.out.println("Memory status"); break;

				default:
					System.out.println("Invalid command");
				}
				break;

				case 10:
					System.out.println("Speed dials"); break;

				case 11:
					System.out.println("Voice tags"); break;
					}
				 break;

				case 2:
					System.out.println("Messages");

				String MessagesMainMenu = """

				1. Write Messages
				2. Inbox
				3. Outbox 
				4. Picture Messages
				5. Templates
				6. Smileys
				7. Messages Settings
				8. Info Service
				9. Voice mailbox number4
				10.Service command editor
					""";
					System.out.println(MessagesMainMenu);
					int messagesMenu = inputCollector.nextInt();

					switch (messagesMenu){

				case 1:  
					System.out.println("Write Messages");break;	
				
				case 2:
					System.out.println("Inbox"); break;
				
				case 3:
					System.out.println("Outbox"); break;

				case 4:
					System.out.println("Picture Messages"); break;

				case 5:
					System.out.println("Templates"); break;

				case 6:
					System.out.println("Smileys"); break;

				case 7:
					System.out.println("Messages Settings"); 

					String messageSettingsMenu = """
					1. Set 1 
					2. Common 
						""";

					System.out.println(messageSettingsMenu);
					int messagesettingsMenuChoice = inputCollector.nextInt();

						switch (messagesettingsMenuChoice){

					case 1:
						System.out.println("Set 1");

				String set1SettingMenu = """

					1. Message centre number
					2. Message sent as 
					3. Message validity
						""";

						System.out.println(set1SettingMenu);
						int set1SettingMenuChoice = inputCollector.nextInt();

						switch (set1SettingMenuChoice){


					case 1:
						System.out.println("Message centre number"); break;

					case 2:
						System.out.println("Message sent as"); break;

					case 3:
						System.out.println("Message validity"); break;
					}
					break;


					case 2:
						System.out.println("common");
					
				String commonSettingMenu = """
					1. Delivery reports
					2. Reply via same centre
					3. Character support
						""";

					System.out.println(commonSettingMenu);
					int commonSettingMenuChoice = inputCollector.nextInt();

					switch (commonSettingMenuChoice){
					case 1:
						System.out.println("Delivery reports"); break;

					case 2:
						System.out.println("Reply via same centre"); break;

					case 3:
						System.out.println("Character support"); break;

					default:
						System.out.println("Invalid command");
					}
					break;
						}
					break;


				case 8:
					System.out.println("Info Service"); break;

				case 9:
					System.out.println("Voice mailbox number4");break;

				case 10:
					System.out.println("Service command editor");break;

				default:
					System.out.println("Invalid command");
					
				}

					 break;


				case 3:
					System.out.println("Chat"); break;

				case 4:
					System.out.println("Call register");

				String callRegister = """
					1. missed calls  
					2. Received callRegister
					3. dialled number
					4. Eras recent call lists
					5. Show call duration
					6. Show  call costs
					7. call cost Settings
					8. Prepaid credit
						""";
						System.out.println(callRegister);
						int callRegisterChoice = inputCollector.nextInt();

					switch (callRegisterChoice){ 
					case 1:
						System.out.println("Missed calls"); break;

					case 2:
						System.out.println("Received callRegister"); break;

					case 3:
						System.out.println("dialled number"); break;

					case 4: 
						System.out.println("Eras recent call lists"); break;

					case 5:
						System.out.println("Show call duration"); break;

					case 6:
						System.out.println("Show call costs"); break;

					case 7:
						System.out.println("Call cost Settings"); break;

					case 8:
						System.out.println("Prepaid credit"); break;
				}

					 
					 break;


				case 5:
					System.out.println("Tones"); break;
				case 6:
					System.out.println("Settings"); break; 

				case 7:
					System.out.println("Call divert"); break;

				case 8:
					System.out.println("Music"); break;

				case 9:
					System.out.println("Games"); break;

				case 10:
					System.out.println("Calculator"); break;

				case 11:
					System.out.println("Reminders"); break;

				case 12:
					System.out.println("Clock"); break;

				case 13:
					System.out.println("Profiles"); break;

				case 14:
					System.out.println("services"); break;

				case 15:
					System.out.println("SIM services"); break;
					}
			inputCollector.close();
		}
	}
