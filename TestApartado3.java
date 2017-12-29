// Hay que cubrir todos los nodos

// Test para llegar al 3er return--> Nodos 1,3,5,6,7,8,9
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
list1.add("foo");
list2.add("bar");
assumeFalse(list1.equals(list2));

//Nodos 1 y 2
List<String> list2 = new ArrayList<String>();
list2.add("bar");
assumeTrue(list2.equals(list2));

//Nodos 1,3 y 4
List<String> list2 = new ArrayList<String>();
list2.add("bar");
List<String> list1 = new ArrayList<String>();
assumeFalse(list2.equals(list1));

//Nodos 1,3,5,6,7,8 y 10
List<String> list2 = new ArrayList<String>();
list2.add("bar");
List<String> list1 = new ArrayList<String>();
list1.add("bar");
assumeTrue(list1.equals(list2));