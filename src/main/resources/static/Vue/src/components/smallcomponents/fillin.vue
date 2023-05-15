<template>
    <div class="center">
<!-- <input type="text" placeholder="请输入问题"> -->
<!-- <input type="text" placeholder="请输入问题提示"> -->
<el-input  placeholder="请输入问题" v-model="input"></el-input>
<el-input  placeholder="请输入答题提示（可空）" v-model="bottom"></el-input>
<!-- <HelloWorld></HelloWorld> -->
    <!-- <p>您输入的内容是：{{ inputValue }}</p> -->
<!-- <el-button  type="success" icon="el-icon-check" circle></el-button> -->
    </div>
</template>


<style>
.center{
height: 80px;
width: 600px;
background-color: white;
border: 1px solid black;

/* border-radius: 18px; */
}

</style>


<script lang="ts">

import axios from 'axios';

export default {
    components:{},
    data() {
    return {
        input: '',
        bottom:''
    }
  },

 
  
}



</script>
<!-- <script>
import inputbox from './inputbox.vue'

export default {
  components: { inputbox },
    comments:{
        inputbox,
    },
}
</script> -->