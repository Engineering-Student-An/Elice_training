package week4.chaptertest.problem1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        // 지시 사항을 참고하여 코드를 작성해 보세요.
        String url = "www.elice.io";
        String hostName = InetAddress.getByName(url).getHostName();
        String ip = InetAddress.getByName(url).getHostAddress();

        System.out.println("호스트명: " + hostName);
        System.out.println("호스트 IP주소: " + ip);
    }
}

