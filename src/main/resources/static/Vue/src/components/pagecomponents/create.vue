<template>
    <div id="create">
      
      <el-button @click="addDiv1" type="primary"  >单选题</el-button>
      <el-button @click="addDiv2" type="primary">填空题</el-button>
      <el-button @click="addDiv3" type="primary">多选题</el-button>
      <!-- <div v-for="(div, index) in div1" :key="index" >
        
        <single class="putcen"></single>
      </div>
      <div v-for="(div, index) in div2" :key="index" >
       <fillin class="putcen"></fillin>
      </div>
      <div v-for="(div, index) in div3" :key="index" >
        <duoxuan class="putcen"></duoxuan>
      </div> -->
      <div v-for="(div, index) in divs" :key="index" class="putcen">
      <component :is="div"></component>
    </div>
     
    </div>
  </template>
  
  <script>
  
import selectdiv from '../smallcomponents/selectdiv.vue'
import xiala from '../smallcomponents/xiala.vue'
import fillin from '../smallcomponents/fillin.vue'
import single from '../smallcomponents/single.vue'
import duoxuan from '../smallcomponents/duoxuan.vue'
import axios from 'axios'

  export default {
    
    components: {
     
      selectdiv,
      xiala,
      fillin,
      single,
      duoxuan,
    },
    data() {
      return {
        // div1: [],
        // div2:[],
        // div3:[],
        divs: [],
      }
    },

    //——————————修改的代码——————————
    methods: {
      fetchData(){
        // 发送GET请求获得数据
      axios.get('/#/create')
        .then(response => {
          console.log("添加1道题目");
          console.log(response.data);
        })
        .catch(error => {
          console.log(error);
        });
    },

    postData(){
      axios({method:'post',url:'http://localhost:8080',data:{
        id:1
    }}).then(response=>{
      console.log(response.data);
    }, err=>{
      console.log(err);
    })
    },
      addDiv1() {
        this.divs.push('single')
        this.fetchData();
        this.postData();
      },
      addDiv2() {
        this.divs.push('fillin')
        this.fetchData();
        this.postData();
      },
      addDiv3() {
        this.divs.push('duoxuan')
        this.fetchData();
        this.postData();
      },

  
  
    }
  }
  </script>
  
  <style>
  .putcen{ 
    position: relative;
    left: 27%;
    /* display: grid;
  place-items: center;
  height: 0vh; */
}
  
  
  #create {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
    /* display: grid;
    place-items: center;
    height: 0vh; */
    
  }
  </style>
  
   
 