public class MyUtil{
  
  
  public static int linearSearch(Object [] a, Object target){
    int index=-1;
    for(int i=0; i<a.length-1; i++){
      if(a[i].equals(target))
        index=i;
    }
    
    
    return index;
  }
  
  public static int binarySearch( Comparable [] a, Comparable target){
    int left=0;
    int right=a.length-1;
    int middle = (left+right)/2;
    int index=-1;
    while(middle != left && middle != right){
      if(a[middle].compareTo(target) ==0){
        return middle;
      }
      else if(a[middle].compareTo(target)>0){
        middle--;
      }
      else
        middle++;
    }
    return index;
  }
  
  public static void selectionSort(Comparable []a){
    for(int i=0; i<a.length-1; i++){
      int mindex = search(i+1, a);
      if(a[mindex].compareTo(a[i])<0)
        switcher(i, mindex, a);
      
    }
  }
     public static int search(int n, Comparable []a){
      //int min = a[n+1];
      int index = n+1;
      for(int i=n+1; i<a.length-2; i++){
        if(a[n+2].compareTo(a[n+1])<0){
          //min=a[n+2];
          index=n+2;
        }
      }
      return index;
    }
    
     public static void switcher(int index1, int index2, Comparable [] a){
      Comparable holder = a[index2];
      a[index2] = a[index1];
      a[index1] = holder;
   
    
    
    }
    
}