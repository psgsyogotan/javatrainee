import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Random;

public class GetDateFromCSV2 {

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

	//コンストラクタ
	public GetDateFromCSV2() {

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
			int Num = Integer.parseInt(strArray[6]);

			// 総合値が指定値以上のとき表示、それ以外のときはやり直し
			if (Num >= point && position.equals(strArray[5])) {
				System.out.println(strArray[1]);
				playername = strArray[1];
				club = strArray[3];

				input.close();
				stream.close();
				br2.close();
				break;
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
