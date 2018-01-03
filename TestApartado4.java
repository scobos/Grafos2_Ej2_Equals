//Todos las parejas de arcos que hemos cubierto con los test de TestApartado3.java son:
//[1,3,4], [1,3,5],[3,5,6], [5,6,7], [6,7,8],[7,8,9]

//Necesito cubrir el requisito de prueba [5,6,10], [7,8,6], [8,6,7], [8,6,10]

// Test para [5,6,10]
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
assumeTrue(list1.equals(list2));

// Test para [7,8,6], [8,6,7], [8,6,10]
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
list1.add("foo");
list1.add("bar");
list2.add("foo");
list2.add("bar");
assumeTrue(list1.equals(list2));