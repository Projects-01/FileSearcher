package fileSearcher

/**
  * Created by shahzada.mansoor on 2/21/17.
  */
trait IOObject {
  val name : String
}

class FileObject(val name: String) extends IOObject {}

class DirectoryObject(val name: String) extends IOObject {}