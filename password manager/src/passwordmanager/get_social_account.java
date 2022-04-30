package passwordmanager;// Packages to import
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class get_social_account {
    // frame
    JFrame f;
    // Table
    JTable j;

    // Constructor
    get_social_account(String email,String pw) throws SQLException {
        // Frame initialization
        f = new JFrame();

        // Frame Title


        // Data to be displayed in the JTable
        String[][] data = {
                { "","","",""}
        };

        // Column Names
        String[] columnNames = { "email", "name", "link" ,"password" };

        // Initializing the JTable

        j =  new JTable(new DefaultTableModel(data,columnNames));
        j.setBounds(30, 40, 200, 300);
        DefaultTableModel model = (DefaultTableModel) j.getModel();
       // model.addRow(new Object[]{"Column 1", "Column 2", "Column 3" ,"column 4"});
        String sql="select * from social_account where id='"+JPanelTest.id+"'";
        ResultSet resultSet = test.s.executeQuery(sql);
        ResultSetMetaData rsmd = resultSet.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        while (resultSet.next()) {
            model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3) ,resultSet.getString(4)});

            System.out.println("");
        }
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }

    // Driver method

}
