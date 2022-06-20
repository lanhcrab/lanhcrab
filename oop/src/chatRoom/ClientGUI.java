//package chatRoom;
//
//import java.io.BufferedReader;
//import java.io.DataOutputStream;
//import java.net.Socket;
//
//public class ClientGUI {
//
//    Socket socket = null;
//    String ip = "";
//    int port = 0;
//    String name = "";
//    BufferedReader bf = null;
//    DataOutputStream os = null;
//
//    public static void main(String[] args) {
//
//    }
//
//    btnNewButton.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent arg0) {
//            try {
//                //Lấy dữ liệu bao gồm name,ip,port
//                ip = inputIP.getText();
//                port = Integer.parseInt(inputPort.getText());
//                name = inputName.getText();
//
//                //Tạo một socket bằng ip và port ở trên
//                socket = new Socket(ip, port);
//
//                // Validation__________________________
//                if (name.isEmpty()) throw new Exception("Empty Name");
//                if (socket == null) throw new Exception("Null Socket");
//
//
//
//                //Cho ChatPanel này "chạy" để kiểm tra tin nhắn đến và đi
//                Thread t=new Thread(chatPanel);
//                t.start();
//
//                //Thông báo chạy thành công
//                JOptionPane.showMessageDialog(contentPane, "Connect success", "Connected",
//                        JOptionPane.INFORMATION_MESSAGE);
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(contentPane,
//                        "Error while connect, please check details try again!\nDetails: " + e,
//                        "Error while connect", JOptionPane.ERROR_MESSAGE);
//            }
//        }
//    });
//
//
//}
