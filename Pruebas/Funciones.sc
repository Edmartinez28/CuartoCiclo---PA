def isPrime (n: Int) = (2 to n-1).forall(k => n%k != 0)

def isPar (n:Int) = (n%2 == 0)

def isImpar (n:Int) = (n%2 != 0)

def isDeficiente (n:Int) ={
  val suma = (2 to n-1).filter(k => n%k == 0).sum
  if(suma > n)
    true
  else
    false
}

/*
def isDeficiente2 (n:Int) ={
  val suma = (1 until x).forall(x%_ == 0 ).sum
  if(suma == n)
    true
  else
    false
}*/

def isPerfecto (n:Int) ={
  val suma = (2 to n-1).filter(k => n%k == 0).sum
  if(suma == n)
    true
  else
    false
}

def isAbundante (n:Int) ={
  val suma = (2 to n-1).filter(k => n%k == 0).sum
  if(suma < n)
    true
  else
    false
}
