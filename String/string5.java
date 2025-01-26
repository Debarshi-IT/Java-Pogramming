class string5{
    public static void main(String[] args) {
          StringBuilder sb=new StringBuilder("Debarshi");
          System.out.println(sb);

          //charAt index 0
          System.out.println(sb.charAt(0));

          // insert value into string in any position
          sb.insert(0, 'p');
          System.out.println(sb);

          //delete value from string in any position
          sb.delete(0, 1);
          System.out.print(sb);

          //use of append function
          StringBuilder sc=new StringBuilder(" ");
          sc.append("C");
          sc.append("h");
          sc.append("a");
          sc.append("t");
          sc.append("t");
          sc.append("e");
          sc.append("r");
          sc.append("j");
          sc.append("e");
          sc.append("e");
          System.out.print(sc);

    }
}