import VueRouter from 'vue-router';
import Vue from "vue";
import create from '../components/pagecomponents/create.vue'
import result from '../components/pagecomponents/result.vue'
import login from '../components/pagecomponents/login.vue'


Vue.use(VueRouter)
const router = new VueRouter({
routes:[
   {path:'/login',component:login}, 
   {path:'/create',component:create},

{path:'/result',component:result},

]



})
export default router