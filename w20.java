package dado;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class w20 {
	 public static ArrayList<ArrayList<String>> groups = new ArrayList<>();
	    public static ArrayList<String> allParticipants = new ArrayList<>();
	    public static ArrayList<String> answeredParticipants = new ArrayList<>();
	public static void main(String[] args) {
		name();
        showAllGroups();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("請輸入數字進行下一步:");
            System.out.println("1. 隨機抽取每組一名成員");
            System.out.println("2. 為每組抽取成員，並可選擇重複");
            System.out.println("3. 顯示所有具有跳過成員選項的組別");
            System.out.println("4. 從 Excel 導入名單");
            System.out.println("5. 將名單保存到 Excel");
            System.out.println("6. 離開");

            int choice = scanner.nextInt();
            scanner.nextLine();  //讀取有用訊息

            switch (choice) {
                case 1:
                    Random();
                    break;
                case 2:
                    drawParticipantsWithRepeat(scanner);
                    break;
                case 3:
                    showAllGroupsWithSkip(scanner);
                    break;
                case 4:
                    loadParticipantsFromExcel(scanner);
                    break;
                case 5:
                    saveParticipantsToExcel();
                    break;
                case 6:
                    System.out.println("退出");
                    System.exit(0);
                    break;
                default:
                    System.out.println("無效的選擇。請重新選擇。");
            }
        }
    }

    public static void name() {
        groups.add(new ArrayList<>());
        groups.add(new ArrayList<>());

        groups.get(0).add("ZZZ");
        groups.get(0).add("XXX");
        groups.get(0).add("CCC");
        groups.get(1).add("QQQ");
        groups.get(1).add("WW");
        groups.get(1).add("EEE");
        groups.get(1).add("RRR");
        
        allParticipants.addAll(groups.get(0));
        allParticipants.addAll(groups.get(1));
    }

    public static void showAllGroups() {
        for (int i = 0; i < groups.size(); i++) {
            System.out.println("組別 " + (i + 1) + ": " + groups.get(i));
        }
    }

    public static void Random() {
    	//隨機抽取成員
        Random random = new Random();
        for (ArrayList<String> group : groups) {
            int index = random.nextInt(group.size());
            System.out.println("組別: " + group);
            System.out.println("抽中成員為: " + group.get(index));
        }
    }

    public static void drawParticipantsWithRepeat(Scanner scanner) {
        Random random = new Random();
        for (ArrayList<String> group : groups) {
            while (true) {
                int index = random.nextInt(group.size());
                String participant = group.get(index);
                System.out.println("組別: " + group);
                System.out.println("抽中的成員: " + participant);
                answeredParticipants.add(participant);
                System.out.println("是否重新抽籤(Y/N)");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }
    }

    public static void showAllGroupsWithSkip(Scanner scanner) {
        for (ArrayList<String> group : groups) {
            System.out.println("組別: " + group);
            System.out.println("請輸入請假之成員名稱 ");
            String skippedParticipantsInput = scanner.nextLine();
            String[] skippedParticipants = skippedParticipantsInput.split(",");

            for (String participant : group) {
                if (!containsIgnoreCase(skippedParticipants, participant)) {
                    System.out.println(participant + " 將回答問題。");
                    answeredParticipants.add(participant);
                } else {
                    System.out.println(participant + " 將跳過此成員.");
                }
            }
        }
    }

    public static boolean containsIgnoreCase(String[] array, String target) {
         //判斷使用者輸的字是否正確(無論大小寫)
    	for (String s : array) {
            if (s.trim().equalsIgnoreCase(target.trim())) {
                return true;
            }
        }
        return false;
    }

    public static void loadParticipantsFromExcel(Scanner scanner) {
        System.out.println("從excel中導入資料");
    }

    public static void saveParticipantsToExcel() {
        System.out.println("沒有將成員名單保存到 Excel。");
	}

}
