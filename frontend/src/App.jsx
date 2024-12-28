import {BrowserRouter as Router, Routes,Route} from 'react-router-dom'
import Home from './pages/Home'
import CreateEmployee from './pages/Clients/CreateEmployee'

function App() {
  return (
    <Router>
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/employee/create-user' element={<CreateEmployee />} />
      </Routes>
    </Router>
  )
}

export default App