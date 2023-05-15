<template>
    <div class="container">
      <div class="header">
        
        <input type="text" placeholder="请输入问题"  class="shuru">
        <!-- <button @click="addCheckbox" class="btn">添加选项</button> -->
        <el-button @click="addCheckbox" type="primary" class="elebtn" >添加选项</el-button>
      </div>
      <div class="content">
        <div v-for="(option, index) in options" :key="index">
          <input type="checkbox" :id="'option-' + index"  class="posi">
          <label :for="'option-' + index">
            <input type="text" placeholder="请输入选项(单选)" v-model="option.text"  class="shuru,posi" >
          </label>
        </div>
      </div>
    </div>
  </template>
  
  <script >
  export default {
    data() {
      return {
        options: []
      }
    },
    methods: {
      addCheckbox() {
        this.options.push({ text: '' })
      }
    }
  }
  </script>
  
  <style>
  .container {
    width: 600px;
    height: auto;
    background-color: #fff;
    border: 1px solid #ccc;
    padding: 10px;
    box-sizing: border-box;
  }
  
  .header {
    display: flex;
    align-items: center;
    margin-bottom: 10px;
  }
  
  .content {
    overflow-y: auto;
    max-height: 60px;
  }
  
  .content input[type="checkbox"] {
    margin-right: 10px;
  }
.shuru{
border: 1px solid #ccc; /* 修改边框样式 */
  background-color: #f5f5f5; /* 修改背景色 */
  border-radius: 5px; /* 添加圆角效果 */
  padding: 10px; /* 添加内边距 */
  font-size: 16px; /* 修改字体大小 */
  font-family: Arial, sans-serif; /* 修改字体 */
position: relative;
left: 20%;


}

.btn{


  /* background-color: #007bff00;  */
  /* color: #fff; */
  padding: 10px; /* 添加内边距 */
  border: none; /* 去掉边框 */
  border-radius: 5px; /* 添加圆角效果 */
  font-size: 16px; /* 修改字体大小 */
  font-family: Arial, sans-serif; 
  cursor: pointer; /* 添加鼠标指针效果 */
}
.btn:hover {
  background-color: #0069d9;
}
.elebtn{
  position: relative;
 left: 20%;
}
.posi{
  position: relative;
}
  </style>