<template>
  <div id="app">
    <router-link to="/create" class="my-link">创建问卷 </router-link>
    
    <router-link to="/login" class="my-link">填写问卷 </router-link>
    <router-link to="/result" class="my-link">填写情况</router-link>
     <router-view></router-view>
   
    <!-- <img alt="Vue logo" src="./assets/logo.png"> -->
    <!-- <HelloWorld msg="Welcome to Your Vue.js App"/> -->
    <!-- <button  class="btn">Add Div</button> -->
    <!-- <el-button  type="success" icon="el-icon-check" circle></el-button> -->
    <!-- <el-button @click="addDiv1" type="primary" >单选题</el-button>
    <el-button @click="addDiv2" type="primary">填空题</el-button>
    <el-button @click="addDiv3" type="primary">多选题</el-button> -->
    <!-- <div v-for="(div, index) in div1" :key="index" >
   
      <single></single>
    </div>
    <div v-for="(div, index) in div2" :key="index" >
     <fillin></fillin>
    </div>
    <div v-for="(div, index) in div3" :key="index" >
      <duoxuan></duoxuan>
    </div> -->
    
   
  </div>
</template>

<script>

import selectdiv from './components/smallcomponents/selectdiv.vue'
import xiala from './components/smallcomponents/xiala.vue'
import fillin from './components/smallcomponents/fillin.vue'
import single from './components/smallcomponents/single.vue'
import duoxuan from './components/smallcomponents/duoxuan.vue'
export default {
  name: 'App',
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
    }
  },
  methods: {
    // addDiv1() {
    //   this.div1.push({})
    // },
    // addDiv2() {
    //   this.div2.push({})
    // },
    // addDiv3() {
    //   this.div3.push({})
    // }

  }
}
</script>

<style>
.btn{
background-color: aquamarine;


}
#app {
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
.my-link {
  color: #333;
  text-decoration: none;
  padding: 10px;
  background-color: #f5f5f5;
  border-radius: 5px;
  font-family: Arial, sans-serif;
  font-size: 16px;
  font-weight: bold;
  margin: 10px;
}

.my-link:hover {
  background-color: #ddd;
  font-size: 18px;
}
</style>
