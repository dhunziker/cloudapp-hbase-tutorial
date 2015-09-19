import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

public class ListTables {

	public static void main(String args[]) throws MasterNotRunningException, IOException {

		// Instantiating a configuration class
		Configuration conf = HBaseConfiguration.create();

		// Latest way of interacting with HBase through a connection
		try (Connection connection = ConnectionFactory.createConnection(conf);

				// Instantiating HBaseAdmin class
				Admin admin = connection.getAdmin()) {

			// Getting all the list of tables using HBaseAdmin object
			HTableDescriptor[] tableDescriptor = admin.listTables();

			// printing all the table names.
			for (int i = 0; i < tableDescriptor.length; i++) {
				System.out.println(tableDescriptor[i].getNameAsString());
			}
		}
	}
}
