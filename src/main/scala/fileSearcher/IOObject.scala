package fileSearcher

import java.io.File

/**
  * Created by shahzada.mansoor
  */
trait IOObject {
  val file : File
  val name = file.getName()
}

class FileObject(val file: File) extends IOObject

class DirectoryObject(val file: File) extends IOObject {
  def children() =
    try
    file.listFiles().toList map(file=>FileConverter convertToIOObject file)
  catch {
    case _ : NullPointerException => List()
  }
}