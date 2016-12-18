class FlatMupWithFor[T] {
 
private var contents: T = _
def set(value: T) { contents = value }
def get: T = contents
 
def flat_Mup(_list: List[List[T]], func: T => T): List[T] = {
 
var out = _list.head.map(func)
val a = _list.length
 
for (i <- 1 until a)
for (i <- 1 until _list.length)
    out = out ::: _list(i).map(func)
    out	
 }
 }