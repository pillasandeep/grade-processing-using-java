import java.applet.*; import java.awt.*;
import com.mysql.cj.jdbc.result.ResultSetMetaData; import java.sql.Connection;
import java.sql.Statement; import java.sql.DriverManager; import java.sql.ResultSet;
import java.sql.PreparedStatement; import java.sql.SQLException; import java.util.*;
import javax.swing.JOptionPane;
 
import javax.swing.table.DefaultTableModel; public class real extends javax.swing.JFrame ;
public real() { initComponents(); this.table_Insert();
}
// <editor-fold defaultstate="collapsed" desc="Generated Code"> private void initComponents() {
stdname = new javax.swing.JTextField(); stdid = new javax.swing.JTextField(); qm = new javax.swing.JTextField();
as1 = new javax.swing.JTextField(); as3 = new javax.swing.JTextField(); as2 = new javax.swing.JTextField();
totalmarks = new javax.swing.JTextField(); insert = new javax.swing.JButton(); ranking = new javax.swing.JButton();
reset = new javax.swing.JButton(); jLabel1 = new javax.swing.JLabel(); jLabel2 = new javax.swing.JLabel(); jLabel3 = new javax.swing.JLabel(); jLabel4 = new javax.swing.JLabel(); jLabel5 = new javax.swing.JLabel(); jLabel6 = new javax.swing.JLabel(); jLabel7 = new javax.swing.JLabel();
 
jScrollPane1 = new javax.swing.JScrollPane(); jTable1 = new javax.swing.JTable(); jTextField8 = new javax.swing.JTextField(); search = new javax.swing.JButton();
jLabel8 = new javax.swing.JLabel(); jScrollPane3 = new javax.swing.JScrollPane(); jTable2 = new javax.swing.JTable();
update = new javax.swing.JButton(); delete = new javax.swing.JButton(); exit = new javax.swing.JButton();
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); stdname.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) { stdnameActionPerformed(evt);
}
});
insert.setText("INSERT");
insert.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) { insertActionPerformed(evt);
}
});
ranking.setText("RANKING");
ranking.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) {
 
rankingActionPerformed(evt);
}
});
reset.setText("RESET");
reset.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) {
resetActionPerformed(evt);

}
});
jLabel1.setText("STUDENT NAME"); jLabel2.setText("STUDENT ID"); jLabel3.setText("QUIZ MARKS"); jLabel4.setText("ASSGINMENT1"); jLabel5.setText("ASSIGNMENT2"); jLabel6.setText("ASSIGNMENT3"); jLabel7.setText("TOTAL MARKS");
jTable1.setModel(new javax.swing.table.DefaultTableModel( new Object [][] {
}
new String [] {
"studentname", "studentid", "quizmarks", "assignment1", "assignment2", "assignment3", "totalmarks"
}
) {
Class[] types = new Class [] {
 
java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
};
public Class getColumnClass(int columnIndex) { return types [columnIndex];
}
});
jTable1.addMouseListener(new java.awt.event.MouseAdapter() { public void mouseClicked(java.awt.event.MouseEvent evt) { jTable1MouseClicked(evt);
}
});
jScrollPane1.setViewportView(jTable1); search.setText("SEARCH");
search.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) { searchActionPerformed(evt);
}
});
jLabel8.setText("STUDENT ID:");
jTable2.setModel(new javax.swing.table.DefaultTableModel( new Object [][] {}
},
new String [] {
 
"studentname", "studentid", "quizmarks", "assginment1", "assignment2", "assignment3", "totalmarks"
}
) {
Class[] types = new Class [] {
java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
};
public Class getColumnClass(int columnIndex) { return types [columnIndex];
}
});
jScrollPane3.setViewportView(jTable2); update.setText("UPDATE");
update.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) { updateActionPerformed(evt);
}
});
delete.setText("DELETE");
delete.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) { deleteActionPerformed(evt);
}
});
 
exit.setText("EXIT");
exit.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) { exitActionPerformed(evt);
}
});
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout); layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEA DING)
.addComponent(jScrollPane1,javax.swing.GroupLayout.PREFERRED_SIZE, 890,javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEA DING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addGap(49, 49, 49)
.addomponent(jLabel7,javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(68, 68, 68))
.addGroup(layout.createSequentialGroup()
.addGap(122, 122, 122)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEA DING)
 
.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel4)
.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel5)
.addComponent(jLabel6))
.addGap(60, 60, 60)))
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAI LING)
.addComponent(stdid, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(qm, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(as1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(stdname, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(as2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(as3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(totalmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(29, 29, 29)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEA DING)
.addComponent(ranking)
 
.addComponent(insert)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEA DING)
.addComponent(update)
.addComponent(reset))
.addGap(31, 31, 31)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEA DING)
.addComponent(exit)
.addComponent(delete)))))
.addGroup(layout.createSequentialGroup()
.addGap(4, 4, 4)
.addComponent(jLabel8)
.addGap(18, 18, 18)
.addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(search))
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addContainerGap(421, Short.MAX_VALUE))); layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Ali gnment.LEADING)
.addGroup(layout.createSequentialGroup(
 
.addContainerGap()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEA DING)
.addComponent(stdname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel1,   javax.swing.GroupLayout.Alignment.TRAILING))
.addGap(2, 2, 2)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BAS ELINE)
.addComponent(jLabel2)
.addComponent(stdid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(insert))
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEA DING)
.addGroup(layout.createSequentialGroup()
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BAS ELINE)
.addComponent(jLabel3)
.addComponent(qm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BAS ELINE)
.addComponent(as1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 
.addComponent(jLabel4))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BAS ELINE) .addComponent(as2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel5))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BAS ELINE)
.addComponent(as3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel6))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BAS ELINE)
.addComponent(totalmarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel7)))
.addGroup(layout.createSequentialGroup()
.addGap(23, 23, 23)
.addComponent(ranking)
.addGap(18, 18, 18)

.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BAS ELINE)
.addComponent(reset)
.addComponent(exit))
 
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BAS ELINE)
.addComponent(update)
.addComponent(delete))))
.addGap(18, 18, 18)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEA DING)
.addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BAS ELINE)
.addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(27, Short.MAX_VALUE)));


pack();
}// </editor-fold>
private void stdnameActionPerformed(java.awt.event.ActionEvent evt) {
}
private void table_Insert()
 
{
int   i; Connection con;
PreparedStatement pst; try
{
Class.forName("com.mysql.cj.jdbc.Driver");

con=DriverManager.getConnection("jdbc:mysql://localhost/project"," root","root");
pst=con.prepareStatement("select * from results"); ResultSet rst=pst.executeQuery(); java.sql.ResultSetMetaData rsd=rst.getMetaData(); i=rsd.getColumnCount();
DefaultTableModel dtm= (DefaultTableModel) jTable1.getModel(); dtm.setRowCount(0);
while(rst.next())
{

Vector v2=new Vector(); for(int a=1;a<i;a++)
{
v2.add(rst.getString("studentname")); v2.add(rst.getString("studentid")); v2.add(rst.getInt("quizmarks")); v2.add(rst.getInt("assginment1")); v2.add(rst.getInt("assignment2"));
 
v2.add(rst.getInt("assignment3")); v2.add(rst.getInt("totalmarks"));
}

dtm.addRow(v2);
}
}
catch(ClassNotFoundException cnf)
{
JOptionPane.showMessageDialog(this,cnf);
//System.out.println(cnf);
}

catch(SQLException sqe)
{

JOptionPane.showMessageDialog(this, sqe);
//System.out.println(sqe);
}

catch(NumberFormatException nfe)
{

JOptionPane.showMessageDialog(this,"ENTER ALL FIELDS");
// System.out.println(nfe);
}
catch(Exception e)
{
JOptionPane.showMessageDialog(this, e);
// System.out.println(e);
 
}}
private void insertActionPerformed(java.awt.event.ActionEvent evt) { Connection con;
PreparedStatement pst; try
{
Class.forName("com.mysql.cj.jdbc.Driver"); con=DriverManager.getConnection("jdbc:mysql://localhost/project"," root","root");
pst=con.prepareStatement("insert into results values(?,?,?,?,?,?,?)"); pst.setString(1,stdname.getText());
pst.setString(2,stdid.getText()); pst.setInt(3,Integer.parseInt(qm.getText())); pst.setInt(4,Integer.parseInt(as1.getText())); pst.setInt(5,Integer.parseInt(as3.getText())); pst.setInt(6,Integer.parseInt(as2.getText())); pst.setInt(7,Integer.parseInt(totalmarks.getText())); int check= pst.executeUpdate();
//System.out.println("insert sucess"); if(check==1)
{
JOptionPane.showMessageDialog(this,"INSERT SUCESS");
}
this.table_Insert();
JOptionPane.showMessageDialog(this,"INSERTED ID "+"\t"+stdid.getText());
 
}
catch(ClassNotFoundException cnf)
{

JOptionPane.showMessageDialog(this,cnf);
//System.out.println(cnf);
}
catch(SQLException sqe)
{
JOptionPane.showMessageDialog(this,sqe);
// System.out.println(sqe);
}

catch(NumberFormatException nfe)
{

JOptionPane.showMessageDialog(this,"data type miss match"+nfe);
//System.out.println(nfe);
}

catch(Exception e)
{

JOptionPane.showMessageDialog(this, e);
//System.out.println(e);
}
}

private void rankingActionPerformed(java.awt.event.ActionEvent evt) { int i;
Connection con;
 
Statement st; try
{

Class.forName("com.mysql.cj.jdbc.Driver");

con=DriverManager.getConnection("jdbc:mysql://localhost/project"," root","root");
st=con.createStatement(); System.out.println("connection");
ResultSet rst=st.executeQuery("select * from results ORDER BY totalmarks desc");
java.sql.ResultSetMetaData rsd=rst.getMetaData(); i=rsd.getColumnCount();
DefaultTableModel dtm= (DefaultTableModel) jTable1.getModel(); dtm.setRowCount(0);
while(rst.next())
{

Vector v2=new Vector(); for(int a=1;a<=i;a++)
{

v2.add(rst.getString("studentname")); v2.add(rst.getString("studentid")); v2.add(rst.getInt("quizmarks")); v2.add(rst.getInt("assginment1")); v2.add(rst.getInt("assignment2")); v2.add(rst.getInt("assignment3"));
 
v2.add(rst.getInt("totalmarks"));
}
dtm.addRow(v2);


}
JOptionPane.showMessageDialog(this,"ranking sucess");
}

catch(ClassNotFoundException cnf)
{

System.out.println(cnf);
}

catch(NumberFormatException nfe)
{

System.out.println(nfe);
}
catch(Exception e)
{
System.out.println(e);
}
}

private void resetActionPerformed(java.awt.event.ActionEvent evt) { stdname.setText(" ");
stdid.setText(" ");
qm.setText(" ");
as1.setText(" ");
 
as3.setText(" ");
as2.setText((" ")); totalmarks.setText(""); jTextField8.setText(" ");
JOptionPane.showMessageDialog(this, "RESET SUCCESS”);
}
private void searchActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
int c; try
{

Class.forName("com.mysql.cj.jdbc.Driver"); Connection con;
con=DriverManager.getConnection("jdbc:mysql://localhost/project"," root","root");
PreparedStatement stm=con.prepareStatement("select * from results where studentid=?");
String stdid=jTextField8.getText(); stm.setString(1, stdid);
ResultSet rst=stm.executeQuery();
// JOptionPane.showMessageDialog(this,"SUCCESS TO FOUND"); java.sql.ResultSetMetaData rsd=rst.getMetaData(); c=rsd.getColumnCount();
DefaultTableModel dtm= (DefaultTableModel) jTable2.getModel(); dtm.setRowCount(0);
while(rst.next())
 
{
Vector v2=new Vector(); for(int a=1;a<=c;a++)
{
v2.add(rst.getString("studentname")); v2.add(rst.getString("studentid")); v2.add(rst.getInt("quizmarks")); v2.add(rst.getInt("assginment1")); v2.add(rst.getInt("assignment2")); v2.add(rst.getInt("assignment3")); v2.add(rst.getInt("totalmarks"));
}
dtm.addRow(v2);
}
}
catch(ClassNotFoundException cnf )
{
JOptionPane.showMessageDialog(this, cnf);
}
catch(NumberFormatException nfe)
{
JOptionPane.showMessageDialog(this,nfe);
}
catch(SQLException sql)
{
 
JOptionPane.showMessageDialog(this,sql);
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(this,ex);
}
}

private void jTable1MouseClicked(java.awt.event.MouseEvent evt) { DefaultTableModel df=(DefaultTableModel)jTable1.getModel();
int selectindex =jTable1.getSelectedRow(); stdname.setText(df.getValueAt(selectindex,0).toString()); stdid.setText(df.getValueAt(selectindex,1).toString()); qm.setText(df.getValueAt(selectindex,2).toString()); as1.setText(df.getValueAt(selectindex,3).toString()); as3.setText(df.getValueAt(selectindex,4).toString()); as2.setText(df.getValueAt(selectindex,5).toString()); totalmarks.setText(df.getValueAt(selectindex,6).toString());
}
private void updateActionPerformed(java.awt.event.ActionEvent evt) { try
{

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con; con=DriverManager.getConnection("jdbc:mysql://localhost/project","root ","root");
 
PreparedStatement pst=con.prepareStatement("UPDATE results set studentname=?,quizmarks=?,assginment1=?,assignment2=?,assignment3
=?,totalmarks=? where studentid=?"); String name=stdname.getText(); String id=stdid.getText();
int quiz=Integer.parseInt(qm.getText()); int ass1=Integer.parseInt(as1.getText()); int ass2=Integer.parseInt(as2.getText()); int ass3=Integer.parseInt(as3.getText());
int tm=Integer.parseInt(totalmarks.getText()); pst.setString(2,id);
pst.setString(1,name); pst.setInt(3,quiz); pst.setInt(4, ass1); pst.setInt(5,ass2); pst.setInt(6,ass3); pst.setInt(7,tm);
int check=pst.executeUpdate(); if(check==1)
{

JOptionPane.showMessageDialog(this,"UPDATE SUCESS");
}

table_Insert();
}

catch(ClassNotFoundException cnf)
{
 
JOptionPane.showMessageDialog(this,cnf);
}
catch(SQLException sql)
{
JOptionPane.showMessageDialog(this,sql);
}
catch(NumberFormatException nfe)
{
JOptionPane.showMessageDialog(this, nfe);
}
catch(Exception e)
{
JOptionPane.showMessageDialog(this,e);
}
}
private void exitActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here: System.exit(0);
}
private void deleteActionPerformed(java.awt.event.ActionEvent evt) { try{
Class.forName("com.mysql.cj.jdbc.Driver"); Connection con;
con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","r oot");
 
PreparedStatement pst=con.prepareStatement("delete from results where studentid=?");
String std=stdid.getText(); pst.setString(1, std); pst.executeUpdate();
JOptionPane.showMessageDialog(this,"DELETED STUDENT ID"+std); this.table_Insert();
// Statement stm=con.createStatement();
//ResultSet rst=stm.executeQuery("DELETE from results where studentid=?");
//Object.setString(1,jTextField2.getText());
}
catch(ClassNotFoundException cnf)
{
JOptionPane.showMessageDialog(this,"CLASS NOT FOUND EXECPTION");
}
catch(NumberFormatException   nfe)
{

JOptionPane.showMessageDialog(this,"NUMBER FORMAT EXECPTION");
}

catch(Exception e)
{

JOptionPane.showMessageDialog(this,e);
}
}
 
public static void main(String args[]) {	try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
if ("Nimbus".equals(info.getName())) { javax.swing.UIManager.setLookAndFeel(info.getClassName()); break;
}
}
} catch (ClassNotFoundException ex) {
java.util.logging.Logger.getLogger(real.class.getName()).log(java.util.loggin g.Level.SEVERE, null, ex);
} catch (InstantiationException ex) { java.util.logging.Logger.getLogger(real.class.getName()).log(java.util.logging
.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) { java.util.logging.Logger.getLogger(real.class.getName()).log(java.util.loggin g.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {


java.util.logging.Logger.getLogger(real.class.getName()).log(java.util.loggin g.Level.SEVERE, null, ex);
}

java.awt.EventQueue.invokeLater(new Runnable() { public void run() {
new real().setVisible(true);
}
});
}
 
private javax.swing.JTextField as1; private javax.swing.JTextField as2; private javax.swing.JTextField as3; private javax.swing.JButton delete; private javax.swing.JButton exit; private javax.swing.JButton insert; private javax.swing.JLabel jLabel1; private javax.swing.JLabel jLabel2; private javax.swing.JLabel jLabel3; private javax.swing.JLabel jLabel4; private javax.swing.JLabel jLabel5; private javax.swing.JLabel jLabel6; private javax.swing.JLabel jLabel7; private javax.swing.JLabel jLabel8;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JScrollPane jScrollPane3; private javax.swing.JTable jTable1;
private javax.swing.JTable jTable2;
private javax.swing.JTextField jTextField8; private javax.swing.JTextField qm;
private javax.swing.JButton ranking; private javax.swing.JButton reset; private javax.swing.JButton search; private javax.swing.JTextField stdid; private javax.swing.JTextField stdname;
 
private javax.swing.JTextField totalmarks; private javax.swing.JButton update;
// End of variables declaration
}
 
