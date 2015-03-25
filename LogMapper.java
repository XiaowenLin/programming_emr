import java.io.IOException;
import
import
import
import
import
import
import
org.apache.hadoop.io.IntWritable;
org.apache.hadoop.io.LongWritable;
org.apache.hadoop.io.Text;
org.apache.hadoop.mapred.MapReduceBase;
org.apache.hadoop.mapred.Mapper;
org.apache.hadoop.mapred.OutputCollector;
org.apache.hadoop.mapred.Reporter;
public class LogMapper extends MapReduceBase
implements Mapper<LongWritable, Text, Text, IntWritable>
{
	private Text word = new Text();
	private final static IntWritable one = new IntWritable( 1 );
	public void map( LongWritable key,
		Text value,
		OutputCollector<Text, IntWritable> output,
		Reporter reporter) throws IOException
	{
		// Get the value as a String
		String text = value.toString();
		// Retrieve the date and time out of the log message, first 15 characters
		String SyslogDateTime = text.substring(0, 15);
		// Output the syslog date and time as the key and 1 as the value
		output.collect( new Text(SyslogDateTime), one );
	}
}
