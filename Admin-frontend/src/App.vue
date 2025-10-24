<!--
 * 程序主入口
 *
 * @Author: ShanZhu
 * @Date: 2023-11-26
-->
<template>
  <div id="app">
    <SongAudio />
    <router-view></router-view>
  </div>
</template>

<script>
import SongAudio from './components/SongAudio';
export default {
  name: 'App',
  components: {
    SongAudio
  }
}
</script>

<style>
</style>
