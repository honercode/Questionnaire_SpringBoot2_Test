import Vue from 'vue'
import App from './App.vue'
import axios from 'axios';
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import router  from './router/index.js'
Vue.config.productionTip = false
Vue.use(ElementUI);
Vue.prototype.$axios = axios;
//Vue.prototype.qs = qs;
new Vue({
  render: h => h(App),
  router:router
}).$mount('#app')
