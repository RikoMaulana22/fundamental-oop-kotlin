fun main(){
   val groups = arrayOf<String>("Group1","Group2","Group3","Group4")
println(groups[0])
println(groups.get(1))
println("---------------")
groups[0]= "Groups satu"
groups.set(1, "Groups Dua")
println(groups[0])
println(groups.get(1))
println(groups.get(2))


}