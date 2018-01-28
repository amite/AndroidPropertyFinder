import React from "react";
import { StyleSheet, Text, View, Image, Button } from "react-native";

import ToastExample from "./ToastExample";

export default class App extends React.Component {
  renderImage(imgURI, index) {
    console.log(imgURI);
    return (
      <Image
        style={{ width: 400, height: 200 }}
        key={index}
        source={{ uri: imgURI }}
      />
    );
  }
  openToast = () => {
    ToastExample.show("Awesome", ToastExample.SHORT);
  };

  render() {
    return (
      <View style={styles.container}>
        <Text>Open up App.js to start working on your app!</Text>
        <Text>Changes you make will automatically reload.</Text>
        <Button onPress={this.openToast} title="Open Toast" />
        <View>{this.props.images.map(this.renderImage)}</View>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center"
  }
});
