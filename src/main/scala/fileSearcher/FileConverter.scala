package fileSearcher

import java.io.File

/**
  * Created by shahzada.mansoor
  */
object FileConverter {
  def convertToIOObject(file: File) =
    if(file.isDirectory()) DirectoryObject(file)
    else FileObject(file)
}
