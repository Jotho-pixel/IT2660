public class MainStack {
    public static void main(String[] args) {
        stack s = new stack(3);
        Listing l1 = new Listing("Bill", "dsafaf", "333333333");
        Listing l2 = new Listing("Jake", "ddddddd", "22222222");
        Listing l3 = new Listing("Walker", "ffffff", "44444444");
        Listing l4 = new Listing("Larry", "bbbbbb", "333333333");
        Listing l5 = new Listing("Luke", "gggggg", "66666666");

        s.push(l1);
        s.push(l2);
        s.push(l3);
        s.push(l4);
        s.push(l5);
        System.out.println(s.peek());
        s.pop();
        s.showAll();
        s.empty();
        s.showAll();
        



    }
    
}
