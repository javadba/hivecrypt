import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

@Description(
		  name = "decrypter",
		  value = "_FUNC_(string) - decrypts column "
		)
public final class Decrypter extends UDF {

   val 
	/**
	 * UDF Evaluation
	 * 
	 * @param s
	 *            Text passed in
	 * @return Unencrypted row
	 */
	public Text evaluate(final Text s) {
		if (s == null) {
			return null;
		}
		String cleaned = Util.filterOutProfanity(s.toString());		
		return new Text(cleaned);
	}



}
