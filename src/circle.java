public class circle {
    public static void main(String[] args) {
        long ans=intersectionArea(0,0,4,6,0,4);
        System.out.println(ans);
    }

    private static long intersectionArea(int x1, int y1, int r1, int x2, int y2, int r2) {
        double pi=3.14;
        double d=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        if(d>=r1+r2){
            return 0;
        }
        if(d+Math.min(r1,r2)<=Math.max(r1,r2)){
            double ans=pi*Math.pow(Math.min(r1,r2),2);
            return (long) Math.floor(ans);
        }
        double part1=r1*r1*Math.acos((d*d + r1*r1 -r2*r2)/(2*d*r1));
        double part2=r2*r2*Math.acos((d*d +r2*r2 -r1*r1)/(2*d*r2));
        double part3=0.5*Math.sqrt((d+r1+r2)*(-d+r1+r2)*(d-r1+r2)*(d+r1-r2));
        double ans=part1+part2-part3;
        return (long) ans;
    }
}
