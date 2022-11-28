import java.util.Scanner;

public class NokiaOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Enter the corresponding numbers to choose menu
                1 - PhoneBook
                2 - Messages
                3 - Chat
                4 - Call Register
                5 - Tones
                6 - Settings
                7 - Call Divert
                8 - Games
                9 - Calculator
                10 - Reminders
                11 - Clock
                12 - Profiles
                13 - SIM Services
                """);
//        System.out.println("Enter a number");
        int menu = input.nextInt();

        switch (menu) {

            case 1:
                System.out.println("PhoneBook");
                System.out.println("""
                        1 - Search
                        2 - Service Nos
                        3 - Add Name
                        4 - Erase
                        5 - Edit
                        6 - Assign tone
                        7 - Send b'card
                        8 - Options
                        9 - Speed dials
                        10 - Voice tags
                        """);
                int PhoneBook = input.nextInt();

                switch (PhoneBook) {
                    case 1:
                        System.out.println("You can search");
                        break;
                    case 2:
                        System.out.println("You can select service nos");
                        break;
                    case 3:
                        System.out.println("Add name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;
                    case 8:
                        System.out.println("Options");
                        System.out.println("""
                        1 - Type of view
                        2 - Memory Status
                        """);
                        int optionsMenu = input.nextInt();
                        switch (optionsMenu) {
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory is 60% full");
                            default -> System.out.println("UNKNOWN APPLICATION");
                        }
                        break;
                    case 9:
                        System.out.println("Speed dial activated");
                        break;
                    case 10:
                        System.out.println("Voice tag");
                        break;
                    default: System.out.println("UNKNOWN APPLICATION");
                }
                break;

            case 2:
                System.out.println("Messages");
                System.out.println("""
                        1 - Write messages
                        2 - Inbox
                        3 - Outbox
                        4 - Picture messages
                        5 - Templates
                        6 - Smileys
                        7 - Message settings
                        8 - Info service
                        9 - Voice mailbox number
                        10 - Service
                        """);
                int Messages = input.nextInt();

                switch (Messages) {
                    case 1:
                        System.out.println("Write your message");
                        break;
                    case 2:
                        System.out.println("Messages from\nMTNNigeria\nFidelityBank\nSen Sis");
                        break;
                    case 3:
                        System.out.println("Messages sent to\nEmmanuel\n131\nKemzy\nGabriel Semicolon");
                        break;
                    case 4:
                        System.out.println("Picture Messages from \nAdesuwa\nDami\nMojoyin\nPrecious\nYetunde");
                        break;
                    case 5:
                        System.out.println("Choose message templates");
                        break;
                    case 6:
                        System.out.println("Choose smileys");
                        break;
                    case 7:
                        System.out.println("Message settings");
                        System.out.println("""
                        1 - Set 1
                        2 - Common
                        """);
                        int messageSettings = input.nextInt();
                        switch (messageSettings) {
                            case 1 -> {
                                System.out.println("Set 1");
                                System.out.println("""
                                        1 - Message centre number
                                        2 - Message sent as
                                        3 - Message validity
                                        """);
                                int set1 = input.nextInt();
                                switch (set1) {
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println("Message sent as");
                                    case 3 -> System.out.println("Message validity");
                                    default -> System.out.println("UNKNOWN APPLICATION");
                                }
                            }
                            case 2 -> {
                                System.out.println("Common");
                                System.out.println("""
                                        1 - Delivery reports
                                        2 - Reply via same centre
                                        3 - Character support
                                        """);
                                int common = input.nextInt();
                                switch (common) {
                                    case 1 -> System.out.println("Messages delivered");
                                    case 2 -> System.out.println("Reply via same centre?\nYes\nNo");
                                    case 3 -> System.out.println("Character support");
                                    default -> System.out.println("UNKNOWN APPLICATION");
                                }
                            }
                        }
                        break;
                    case 8:
                        System.out.println("Info service");
                        break;
                    case 9:
                        System.out.println("Voice mailbox number");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        break;
                    default: System.out.println("UNKNOWN APPLICATION");
                }
                break;

            case 3:
                System.out.println("Chat");
                break;

            case 4:
                System.out.println("Call Register");
                System.out.println("""
                        1 - Missed calls
                        2 - Received calls
                        3 - Dialled numbers
                        4 - Erase recent call lines
                        5 - Show call duration
                        6 - Show call costs
                        7 - Call costs settings
                        8 - Prepaid credit
                        """);
                int callRegister = input.nextInt();

                switch (callRegister) {

                    case 1:
                        System.out.println("Missed calls from\nWizo\nMum\nDad\nML\nAlice");
                        break;
                    case 2:
                        System.out.println("Received calls from\nJerry\nDad\nMum\nAdesuwa");
                        break;
                    case 3:
                        System.out.println("You last dialled\nJerry\nDami\nDemola\nTosin");
                        break;
                    case 4:
                        System.out.println("Your recent call lines have been erased");
                        break;
                    case 5:
                        System.out.println("Show call duration");
                        System.out.println("""
                        1 - Last call duration
                        2 - All calls duration
                        3 - Received calls duration
                        4 - Dialled calls duration
                        5 - Clear timers
                        """);
                        int callDuration = input.nextInt();
                        switch (callDuration) {
                            case 1 -> System.out.println("Last call duration was 14 min 25 sec");
                            case 2 -> System.out.println("All calls duration is 72 hours 55 min 13 sec");
                            case 3 -> System.out.println("Received calls duration is 2 hours 19 min 32 sec");
                            case 4 -> System.out.println("Dialled calls duration is 4 hours 47 mins 02 sec");
                            case 5 -> System.out.println("Your call timer has been cleared");
                            default -> System.out.println("UNKNOWN APPLICATION");
                }
                break;
                    case 6:
                        System.out.println("Show call costs");
                        System.out.println("""
                                1 - Last call cost
                                2 - All call cost
                                3 - Clear counters
                                """);
                        int callCosts = input.nextInt();
                        switch (callCosts) {
                            case 1 -> System.out.println("Your last call cost was 17 naira");
                            case 2 -> System.out.println("All your call costs totalled 9000 naira");
                            case 3 -> System.out.println("Your counter has been cleared");
                            default -> System.out.println("UNKNOWN APPLICATION");
                        }
                        break;
                    case 7:
                        System.out.println("Call cost settings");
                        System.out.println("""
                                1 - Call cost limit
                                2 - Show costs in
                                """);
                        int costSettings = input.nextInt();
                        switch (costSettings) {
                            case 1 -> System.out.println("Your call cost limit is 10000");
                            case 2 -> System.out.println("Show costs in naira N");
                            default -> System.out.println("UNKNOWN APPLICATION");
                        }
                        break;
                    case 8:
                        System.out.println("Your prepaid credit is 800 naira");
                        break;
                    default: System.out.println("UNKNOWN APPLICATION");
                }
                break;

            case 5:
                System.out.println("Tones");
                System.out.println("""
                        1 - Ringing tone
                        2 - Ringing volume
                        3 - Incoming call alert
                        4 - Composer
                        5 - Message alert tone
                        6 - Keypad tones
                        7 - Warning and game tones
                        8 - Vibrating alert
                        9 - Screen saver
                        """);
                int tones = input.nextInt();

                switch (tones) {
                    case 1:
                        System.out.println("Your ringing tone is Ring Ring");
                        break;
                    case 2:
                        System.out.println("Your ringing volume is at 8");
                        break;
                    case 3:
                        System.out.println("Your incoming call alert tone is Alert 1");
                        break;
                    case 4:
                        System.out.println("You can compose your ringing tone");
                        break;
                    case 5:
                        System.out.println("Your message alert tone is Message 2");
                        break;
                    case 6:
                        System.out.println("Your keypad tone is on");
                        break;
                    case 7:
                        System.out.println("Your warning and alert tones frog");
                        break;
                    case 8:
                        System.out.println("Your phone has been put on vibration for any alert");
                        break;
                    case 9:
                        System.out.println("Your screen saver has been applied");
                        break;
                    default: System.out.println("UNKNOWN APPLICATION");
                }
                break;

            case 6:
                System.out.println("Settings");
                System.out.println("""
                        1 - Call settings
                        2 - Phone settings
                        3 - Security settings
                        4 - Restore factory settings
                        """);
                int settings = input.nextInt();

                switch (settings) {
                    case 1:
                        System.out.println("Call settings");
                        System.out.println("""
                        1 - Automatic redial
                        2 - Speed dialing
                        3 - Call waiting options
                        4 - Own number sending
                        5 - Phone line in use
                        6 - Automatic answers
                        """);
                        int callSettings = input.nextInt();
                        switch (callSettings) {
                            case 1 -> System.out.println("Your calls have been set on automatic redial");
                            case 2 -> System.out.println("Speed dialing activated");
                            case 3 -> System.out.println("Call waiting activated");
                            case 4 -> System.out.println("Own number sending activated");
                            case 5 -> System.out.println("Phone line in use activated");
                            case 6 -> System.out.println("Automatic answers activated");
                            default -> System.out.println("UNKNOWN APPLICATION");
                }
                break;
                    case 2:
                        System.out.println("Phone Settings");
                        System.out.println("""
                        1 - Language
                        2 - Cell info display
                        3 - Welcome note
                        4 - Network selection
                        5 - Lights
                        6 - Confirm SIM Services actions
                                """);
                        int phoneSettings = input.nextInt();
                        switch (phoneSettings) {
                            case 1 -> System.out.println("Your language has been changed");
                            case 2 -> System.out.println("Here's your cell info display");
                            case 3 -> System.out.println("Welcome note changed");
                            case 4 -> System.out.println("Network selection confirmed");
                            case 5 -> System.out.println("Brightness increased");
                            case 6 -> System.out.println("SIM service actions confirmed");
                            default -> System.out.println("UNKNOWN APPLICATION");
                        }
                        break;
                    case 3:
                        System.out.println("Security Settings");
                        System.out.println("""
                        1 - PIN code request
                        2 - Call baring service
                        3 - Fixed dialing
                        4 - Closed user group
                        5 - Phone security
                        6 - Change access codes
                                """);
                        int securitySettings = input.nextInt();
                        switch (securitySettings) {
                            case 1 -> System.out.println("PIN code request activated");
                            case 2 -> System.out.println("Call baring service activated");
                            case 3 -> System.out.println("Fixed dialing activated");
                            case 4 -> System.out.println("Closed user group activated");
                            case 5 -> System.out.println("Phone security settings activated");
                            case 6 -> System.out.println("Access codes changed");
                            default -> System.out.println("UNKNOWN APPLICATION");
                }
                break;
                    case 4:
                        System.out.println("Restore factory settings");
                        break;
                    default: System.out.println("UNKNOWN APPLICATION");
                }
                break;

            case 7:
                System.out.println("Call divert activated");
                break;

            case 8:
                System.out.println("Choose games\nSpace Impact\nBantumi\nSnakeII");
                break;

            case 9:
                System.out.println("Calculator");
                break;

            case 10:
                System.out.println("Set Reminder");
                break;

            case 11:
                System.out.println("Clock");
                System.out.println("""
                        1 - Alarm clock
                        2 - Clock settings
                        3 - Date setting
                        4 - Stopwatch
                        5 - Countdown timer
                        6 - Auto update of date and time
                        """);
                int clock = input.nextInt();
                switch (clock) {
                    case 1 -> System.out.println("Set alarm clock");
                    case 2 -> System.out.println("Set clock\n12 or 24 hour format");
                    case 3 -> System.out.println("Set date");
                    case 4 -> System.out.println("Start stopwatch");
                    case 5 -> System.out.println("Set timer countdown");
                    case 6 -> System.out.println("Auto update of date and time on");
                    default -> System.out.println("UNKNOWN APPLICATION");
                }
                break;

            case 12:
                System.out.println("Check user Profiles");
                break;

            case 13:
                System.out.println("Check SIM Services");
                break;
        }

    }
}

