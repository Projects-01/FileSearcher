package fileSearcher

import java.io.File

/**
  * Created by shahzada.mansoor on 2/21/17.
  */
trait IOObject {
  val file : File
  val name = file.getName()
}

class FileObject(val file: File) extends IOObject

class DirectoryObject(val file: File) extends IOObject