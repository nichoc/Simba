/*
 *  Copyright 2016 by Simba Project                                   
 *                                                                            
 *  Licensed under the Apache License, Version 2.0 (the "License");           
 *  you may not use this file except in compliance with the License.          
 *  You may obtain a copy of the License at                                   
 *                                                                            
 *    http://www.apache.org/licenses/LICENSE-2.0                              
 *                                                                            
 *  Unless required by applicable law or agreed to in writing, software       
 *  distributed under the License is distributed on an "AS IS" BASIS,         
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
 *  See the License for the specific language governing permissions and       
 *  limitations under the License.                                            
 */

package org.apache.spark.sql.types

import org.apache.spark.sql.spatial.Shape

/**
  * Created by dong on 3/24/16.
  */
class ShapeType private() extends DataType{
  private[sql] type InternalType = Shape

  override def asNullable: DataType = this

  override def defaultSize: Int = 4096

  override def simpleString: String = "Shape"
}

case object ShapeType extends ShapeType
