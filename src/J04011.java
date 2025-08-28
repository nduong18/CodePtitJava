import java.io.*;
import java.util.*;

public class J04011 {
    static class Point3D {
        int x, y, z;
        Point3D(int x, int y, int z) {
            this.x = x; this.y = y; this.z = z;
        }
        static boolean check(Point3D a, Point3D b, Point3D c, Point3D d) {
            int abx = b.x - a.x, aby = b.y - a.y, abz = b.z - a.z;
            int acx = c.x - a.x, acy = c.y - a.y, acz = c.z - a.z;
            int adx = d.x - a.x, ady = d.y - a.y, adz = d.z - a.z;

            int nx = aby * acz - abz * acy;
            int ny = abz * acx - abx * acz;
            int nz = abx * acy - aby * acx;

            int dot = nx * adx + ny * ady + nz * adz;
            return dot == 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Point3D p1 = new Point3D(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            Point3D p2 = new Point3D(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            Point3D p3 = new Point3D(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            Point3D p4 = new Point3D(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            if (Point3D.check(p1, p2, p3, p4)) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.print(sb.toString());
    }
}
