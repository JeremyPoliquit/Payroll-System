import {BrowserRouter as Router, Routes,Route} from 'react-router-dom'
import Home from './pages/Home'
import CreateEmployee from './pages/Clients/CreateEmployee'
import DisplayFulltime from './pages/Clients/DisplayFulltime'

function App() {
  return (
    <Router>
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/client/create' element={<CreateEmployee />} />
        <Route path='/client/display-fulltime' element={<DisplayFulltime />} />
      </Routes>
    </Router>
  )
}

export default App