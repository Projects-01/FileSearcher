package fileSearcher

import javax.tools.FileObject
import java.io.File

/**
  * Created by shahzada.mansoor on 3/6/17.
  */
object FileConverter {
  def convertToIOObject(file: File) =
    if(file.isDirecctory()) DirectoryObject(file)
    else FileObject(file)
}
