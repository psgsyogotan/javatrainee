//GetdateFromCSV_bはポジジョンによる探索を
//①FW
//②MF
//③DF
//④GK
//に分けて行う

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Random;

public class GetDateFromCSV_b {
	private int point;
	private String csvlimit;
	private int count = 0;
	private String position;
	private String playername;
	private String club;

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	// コンストラクタ
	public GetDateFromCSV_b() {

	}

	public void GetPlayer(int point, String position) throws Exception {

		FileReader filereader = new FileReader("C:/aaa.csv"); // ファイル読み込み
		BufferedReader br = new BufferedReader(filereader);

		// csvファイルの選手数をカウントする
		while ((csvlimit = br.readLine()) != null) {
			count++;

		}
		while (true) {
			// FileReader filereader2 = new FileReader("C:/aaa.csv");
			// BufferedReader br2 = new BufferedReader(filereader2);
			File file = new File("C:/aaa.csv");
			FileInputStream input = new FileInputStream(file);
			InputStreamReader stream = new InputStreamReader(input, "SJIS");
			BufferedReader br2 = new BufferedReader(stream);

			String line;
			br2.readLine();// csvファイルの一行目はカラム値なので読み飛ばし
			Random rnd = new Random();
			int ran = rnd.nextInt(count);

			// 乱数分csvファイルの行を読み飛ばし
			for (int i = 0; i < ran - 1; i++) {
				line = br2.readLine();
			}

			// 選手データ読み込み
			line = br2.readLine();

			String[] strArray = line.split(",");
			// csvファイルは6列目に総合値が入っているのでNumに値を代入
			int Num = Integer.parseInt(strArray[5]);

			// 総合値が指定値以上のとき表示、ポジションによってさらに判別
			if (position.equals("FW")) {
				if (Num >= point
						&& ((strArray[4].equals("CF"))
								|| (strArray[4].equals("ST"))
								|| (strArray[4].equals("RWF")) 
								|| (strArray[4].equals("LWF")))) {
					System.out.println(strArray[1]);
					playername = strArray[1];
					club = strArray[3];

					input.close();
					stream.close();
					br2.close();
					break;
				}
			} else if (position.equals("MF")) {
				if (Num >= point
						&& ((strArray[4].equals("OMF"))
								|| (strArray[4].equals("CMF"))
								|| (strArray[4].equals("DMF"))
								|| (strArray[4].equals("LMF")) 
								|| (strArray[4].equals("RMF")))) {
					System.out.println(strArray[1]);
					playername = strArray[1];
					club = strArray[3];

					input.close();
					stream.close();
					br2.close();
					break;
				}
			} else if (position.equals("DF")) {
				if (Num >= point
						&& ((strArray[4].equals("LSB"))
								|| (strArray[4].equals("RSB")) 
								|| (strArray[4].equals("CB")))) {
					System.out.println(strArray[1]);
					playername = strArray[1];
					club = strArray[3];

					input.close();
					stream.close();
					br2.close();
					break;
				}
			} else if (position.equals("CF,ST")) {
				if (Num >= point
						&& ((strArray[4].equals("CF")) 
								|| (strArray[4].equals("ST")))) {
					System.out.println(strArray[1]);
					playername = strArray[1];
					club = strArray[3];

					input.close();
					stream.close();
					br2.close();
					break;
				}
			} else if (position.equals("WFW,SHF")) {
				if (Num >= point
						&& ((strArray[4].equals("RWF"))
								|| (strArray[4].equals("LWF"))
								|| (strArray[4].equals("LMF"))
								|| (strArray[4].equals("RMF")))) {
					System.out.println(strArray[1]);
					playername = strArray[1];
					club = strArray[3];

					input.close();
					stream.close();
					br2.close();
					break;
				}
			}
			else if (position.equals("SB")) {
				if (Num >= point
						&& ((strArray[4].equals("RSB"))
								|| (strArray[4].equals("LSB")))) {
					System.out.println(strArray[1]);
					playername = strArray[1];
					club = strArray[3];

					input.close();
					stream.close();
					br2.close();
					break;
				}
			}

			else {
				if (Num >= point && (strArray[4].equals("GK"))) {
					System.out.println(strArray[1]);
					playername = strArray[1];
					club = strArray[3];

					input.close();
					stream.close();
					br2.close();
					break;
				}
			}

		}
		filereader.close();
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}
}
