//countPairs
public int countPairs(String str) {
  if (str.length()<3) return 0;
  int count=0;
  if (str.charAt(0)==(str.charAt(2))) count++;
  return count+countPairs(str.substring(1));
}

//countAbc
public int countAbc(String str) {
  if (str.length()<3) return 0;
  int count=0;
  if (str.substring(0,3).equals("abc")||str.substring(0,3).equals("aba")) count++;
  return count+countAbc(str.substring(1));
}

//count11
public int count11(String str) {
  if (str.length()<2) return 0;
  if (str.substring(0,2).equals("11")) return 1+count11(str.substring(2));
  return count11(str.substring(1));
}

//stringClean
public String stringClean(String str) {
  if (str.length()<2) return str;
  if (str.charAt(0)==(str.charAt(1))) return stringClean(str.substring(1));
  return str.charAt(0)+stringClean(str.substring(1));
}

//countHi2
public int countHi2(String str) {
  if (str.length()<2) return 0;
  if (str.length()>2 && str.substring(0, 3).equals("xhi")){
    return countHi2(str.substring(3));
  }
  if(str.substring(0, 2).equals("hi"))
  return 1 + countHi2(str.substring(2));
return countHi2(str.substring(1));
}

//parenBit
public String parenBit(String str) {
  if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')') return str;
  if (str.charAt(0) == '(') return parenBit(str.substring(0, str.length()-1));
  if (str.charAt(str.length()-1) == ')') return parenBit(str.substring(1));
  return parenBit(str.substring(1, str.length() - 1));
}

//nestParen
public boolean nestParen(String str) {
  if (str.length()<1) return true;
  if (str.charAt(0)=='(' && str.charAt(str.length()-1)==')'){
  return nestParen(str.substring(1, str.length()-1));
  }
  else{
    return false;
  }
}

//strCount
public int strCount(String str, String sub) {
  if (str.length()<sub.length()) return 0;
  if (str == sub) return 1;
  if (str.substring(0, sub.length()).equals(sub)){
    return 1+strCount(str.substring(sub.length()), sub);
  }
  else{
    return strCount(str.substring(1), sub);
  }
}

//strCopies
public boolean strCopies(String str, String sub, int n) {
  if (n==0) return true;
  if(str.length() < sub.length()) return false;
  if (str.substring(0, sub.length()).equals(sub)){
    return strCopies(str.substring(1), sub, n-1);
  }
  else{
    return strCopies(str.substring(1), sub, n); 
  }
}

//strDist
public int strDist(String str, String sub) {
  if (str.length() < sub.length()) return 0;

  if (str.substring(0, sub.length()).equals(sub) && str.substring(str.length() - sub.length()).equals(sub))
  {return str.length();
  }
  if (!str.substring(0, sub.length()).equals(sub)){
    return strDist(str.substring(1), sub);
  }
  return strDist(str.substring(0, str.length()-1), sub);

}
