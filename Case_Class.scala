object Case_Class {

    case class Point(a:Int,b:Int){
      def x:Int = a
      def y:Int = b

      def +(that:Point):Point  = Point(this.x+that.x,this.y+that.y)

      def -(that:Point):Point  = Point(this.x-that.x,this.y-that.y)


      def move(dx:Int,dy:Int):Point = {
        Point(dx+x,dy+y)
      }


      def invert():Unit={
        println("Invert X and Y points: "+Point(y,x))
      }
    }

    def main(args:Array[String]): Unit ={
      val p1 = Point(10,15)
      val p2 = Point(5,10)
      val p3 = p1.move(3,6)
      //val p4 = p1.copy(a=2)

      println(p1)
      println(p2)
      println(p3)
      //println(p4)
      //println(p1 == p2)

      println("Addition of the two points : "+p1.+(p2))
      println("Different of the two points: "+p1.-(p2))
      p1.invert()
    }



}
